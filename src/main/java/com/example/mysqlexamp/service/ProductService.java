package com.example.mysqlexamp.service;

import com.example.mysqlexamp.model.Student;
import com.example.mysqlexamp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
   private Repo db;


    public Student addstudent(Student student){
        return db.save(student);
    }
    public Student getStudentbyId(int id){
       return db.findById(id).orElse(null);
    }

    public List<Student> getStudents(){
        return db.findAll();
    }
}
