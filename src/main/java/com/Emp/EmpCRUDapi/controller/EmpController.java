package com.Emp.EmpCRUDapi.controller;

import com.Emp.EmpCRUDapi.model.Employee;
import com.Emp.EmpCRUDapi.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpServiceImpl empService  ;
    @PostMapping("emp")
    public String createEmp(@RequestBody Employee employee){
        return empService.create(employee) ;
    }
    @GetMapping("emp")
    public List<Employee> readEmp(){
        return empService.read() ;
    }
    @PutMapping("emp/{id}")
    public String updateEmp(){
        return "Heyyyy" ;
    }

    @DeleteMapping("emp/{id}")
    public String deleteEmp(){
        return "Hi" ;
    }



}
