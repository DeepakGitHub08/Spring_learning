package com.deepak.RESTProject.demo.restControllers;

import com.deepak.RESTProject.demo.entity.Employee;
import com.deepak.RESTProject.demo.entity.EmployeeDAO;
import com.deepak.RESTProject.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }
}
