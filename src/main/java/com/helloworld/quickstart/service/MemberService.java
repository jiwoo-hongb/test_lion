package com.helloworld.quickstart.service;

import com.helloworld.quickstart.connected.Member;
import com.helloworld.quickstart.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public List<Member> getAllMembers() {
        List<Member> members = repository.findAll();

        for(Member member : members) {
            System.out.println("13기 인원 데이터" + member);
        }
        System.out.println("🔍 DB에서 가져온 데이터 개수: " + members.size());  // 콘솔에 출력
        return members;
    }
}
