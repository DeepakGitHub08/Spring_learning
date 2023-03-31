package com.deepak.springDemo.rest;

import com.deepak.springDemo.dao.StudentDAO;
import com.deepak.springDemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentDAO studentDAO;
    @Autowired
    public StudentRestController(StudentDAO theStudentDAO){
        studentDAO =theStudentDAO;
    }
    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return studentDAO.findByID(studentId);
    }
    @S
}
