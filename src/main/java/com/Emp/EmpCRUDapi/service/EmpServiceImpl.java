package com.Emp.EmpCRUDapi.service;

import com.Emp.EmpCRUDapi.entity.EmpEntity;
import com.Emp.EmpCRUDapi.model.Employee;
import com.Emp.EmpCRUDapi.repository.EmpRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List ;
@Service
public class EmpServiceImpl implements EmpService{

    private final List<EmpEntity> empdb = new ArrayList<>();
    @Autowired
    private EmpRepo empRepo ;

    @Override
    public String create(Employee employee) {
        EmpEntity empEntity = new EmpEntity() ;
        BeanUtils.copyProperties(employee,empEntity);

        empRepo.save(empEntity);
        return "Created Successfully ";
    }

    @Override
    public List<Employee> read() {
       // EmpEntity empEntity = new EmpEntity();
        List<Employee> empLists = new ArrayList<>();
        List<EmpEntity> empEntityList = empRepo.findAll() ;
        for(EmpEntity empEntity  : empEntityList){
            Employee employee = new Employee();
            BeanUtils.copyProperties(empEntity,employee);
            empLists.add(employee);
        }
        return empLists;
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }
}
