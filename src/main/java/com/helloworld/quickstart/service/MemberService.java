package com.helloworld.quickstart.service;

import com.helloworld.quickstart.connected.Member;
import com.helloworld.quickstart.dto.MemberUpdateDto;
import com.helloworld.quickstart.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    // ✅ [1] 전체 회원 조회
    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    // ✅ [2] 회원 추가
    public Member addMember(Member member) {
        return repository.save(member);
    }

    // ✅ [3] 회원 삭제 (studentId로)
    @Transactional
    public boolean deleteMemberByStudentId(int studentId) {
        Optional<Member> member = repository.findByStudentId(studentId);
        if (member.isPresent()) {
            repository.delete(member.get());
            return true;
        }
        return false;
    }

    // ✅ [4] 회원 정보 수정 (studentId로 찾기)
    @Transactional
    public Optional<Member> updateMemberByStudentId(int studentId, MemberUpdateDto updateDto) {
        Optional<Member> optionalMember = repository.findByStudentId(studentId);

        if (optionalMember.isPresent()) {
            Member member = optionalMember.get();

            // 입력된 값이 있으면 업데이트, 없으면 기존 값 유지
            if (updateDto.getDepartment() != null) member.setDepartment(updateDto.getDepartment());
            if (updateDto.getEmail() != null) member.setEmail(updateDto.getEmail());
            if (updateDto.getDevField() != null) member.setDevField(updateDto.getDevField());
            if (updateDto.getGeneration() != null) member.setGeneration(updateDto.getGeneration());

            repository.save(member);
            return Optional.of(member);
        }
        return Optional.empty();
    }

}
