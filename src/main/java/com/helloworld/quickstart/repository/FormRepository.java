package com.helloworld.quickstart.repository;

import com.helloworld.quickstart.connected.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {
}
