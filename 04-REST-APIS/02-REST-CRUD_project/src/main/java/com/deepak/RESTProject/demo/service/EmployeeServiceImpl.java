package com.deepak.RESTProject.demo.service;

import com.deepak.RESTProject.demo.entity.Employee;
import com.deepak.RESTProject.demo.entity.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
    @Override
    public Employee save(Employee employee){
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeDAO.deleteEmployee(id);
    }
}
