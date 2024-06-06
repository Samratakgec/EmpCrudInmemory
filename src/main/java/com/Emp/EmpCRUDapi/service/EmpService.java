package com.Emp.EmpCRUDapi.service;

import com.Emp.EmpCRUDapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {

    public String create(Employee employee) ;
    public List<Employee> read();
    public String update();
    public String delete();

}
