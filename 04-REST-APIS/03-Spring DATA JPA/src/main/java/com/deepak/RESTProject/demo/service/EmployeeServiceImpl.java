package com.deepak.RESTProject.demo.service;

import com.deepak.RESTProject.demo.entity.Employee;
import com.deepak.RESTProject.demo.entity.EmployeeDAO;
import com.deepak.RESTProject.demo.entity.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepo;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepo){
        this.employeeRepo = employeeRepo;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> theEmployee = employeeRepo.findById(id);
        if (theEmployee.isPresent()){
            return theEmployee.get();
        }
        return null;
    }
    @Override
    public Employee save(Employee employee){
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeRepo.deleteById(id);
    }
}
