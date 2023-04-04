package com.deepak.RESTProject.demo.restControllers;

import com.deepak.RESTProject.demo.entity.Employee;
import com.deepak.RESTProject.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //add mapping for GET /employee/{employeeID}
    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId){
        Employee employee = employeeService.findById(employeeId);
        if (employee == null){
            throw new RuntimeException("Employee id is not found" + employeeId);
        }
        return employee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        //add just in case  they pass an id in JSON  ... set id to 0
        // this is to force a save of new item  ... instead of update
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @PutMapping("/employee")
    public Employee UpdateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId){
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException("Employee id not found -" + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee id is :" + employeeId;
    }
}
