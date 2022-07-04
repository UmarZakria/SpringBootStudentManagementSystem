package com.studentboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentboot.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
