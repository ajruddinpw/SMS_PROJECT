 package net.ajju.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ajju.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
