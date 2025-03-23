package com.helloworld.quickstart.repository;

import com.helloworld.quickstart.connected.DevMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//이 인터페이스가 데이터 액세스 계층(DAO, Data Access Object)임을 나타냄
public interface DevMemberRepository extends JpaRepository<DevMember, Integer> {
}
//JPA 레파지토리
//Integer는 기본 key(id)의 타입
//jap 상속받을시 CRUD 메서드 자동 제공