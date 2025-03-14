package com.helloworld.quickstart.service;

import com.helloworld.quickstart.connected.DevMember;
import com.helloworld.quickstart.repository.DevMemberRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DevMemberService {
    private final DevMemberRepository repository;

    public DevMemberService(DevMemberRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true) // ✅ 트랜잭션을 사용해보기
    public List<DevMember> getAllDevMembers() {
        List<DevMember> devMembers = repository.findAll();

        // ✅ 강제로 모든 데이터를 출력해보기
        for (DevMember dev : devMembers) {
            System.out.println("✔ 웹 개발진 데이터: " + dev);
        }

        System.out.println("🔍 DB에서 가져온 데이터 개수: " + devMembers.size());
        return devMembers;
    }
}