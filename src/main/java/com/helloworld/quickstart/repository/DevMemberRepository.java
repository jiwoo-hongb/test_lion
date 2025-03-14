package com.helloworld.quickstart.repository;

import com.helloworld.quickstart.connected.DevMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevMemberRepository extends JpaRepository<DevMember, Integer> {
}
