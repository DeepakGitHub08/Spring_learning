package com.deepak.springDemo.dao;

import com.deepak.springDemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);

    public Student findByID(Integer id);
    public List<Student> queryResults(String query);
}
