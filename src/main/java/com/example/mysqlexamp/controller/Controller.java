package com.example.mysqlexamp.controller;

import com.example.mysqlexamp.model.Student;
import com.example.mysqlexamp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ProductService service;
    @RequestMapping("/home")
    public String home(){
        return "Welcome to our page guys";
    }

    @PostMapping("home/postStudent")
    public Student addStudent(@RequestBody Student student){
        return service.addstudent(student);
    }
    @GetMapping("/home/getStudent/all")
    public List<Student> getAll(){
      return service.getStudents();
    }

    @GetMapping("/home/getStudent/{id}")
    public Student getById(@PathVariable int id){
        return service.getStudentbyId(id);
    }
}
