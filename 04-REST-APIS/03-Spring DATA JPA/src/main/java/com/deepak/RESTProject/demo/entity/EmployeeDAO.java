package com.deepak.RESTProject.demo.entity;

import java.util.List;

public interface EmployeeDAO {
    public Employee save(Employee employee);
    public Employee findById(Integer id);
    public void deleteEmployee(Integer id);
    public List<Employee> findAll();
}
