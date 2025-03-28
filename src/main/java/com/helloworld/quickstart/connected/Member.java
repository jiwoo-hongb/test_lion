package com.helloworld.quickstart.connected;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_id", nullable = false, unique = true)
    private int studentId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "dev_field", nullable = false)
    private String devField;

    @Column(name = "generation", nullable = false)
    private int generation;

    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setEmail(String email) { this.email = email; }
    public void setDevField(String devField) { this.devField = devField; }
    public void setGeneration(int generation) { this.generation = generation; }
}
