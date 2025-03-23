package com.helloworld.quickstart.repository;

import com.helloworld.quickstart.connected.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByName(String name);  // 이름으로 회원 검색
}