package com.deepak.springDemo.dao;

import com.deepak.springDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager){
            entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findByID(Integer id) {
        return entityManager.find(Student.class, id);
    }

    public List<Student> queryResults(String query){
        TypedQuery<Student> theQuery = entityManager.createQuery(query, Student.class);
        List<Student> students = theQuery.getResultList();
        return students;
    }
}
