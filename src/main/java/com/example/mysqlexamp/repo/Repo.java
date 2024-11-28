package com.example.mysqlexamp.repo;

import com.example.mysqlexamp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student,Integer> {
}
