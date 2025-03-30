package com.bluemoon.rest.service;

import com.bluemoon.rest.model.Employee;
import com.bluemoon.rest.repository.BlueMoonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueMoonService {

    @Autowired
    BlueMoonRespository blueMoonRespository;

    public Employee createEmployee(Employee employee){
        Employee employeeDetails = new Employee();
        employeeDetails = employee;
        employeeDetails.setName("Default");
        return blueMoonRespository.createEmployee(employeeDetails);
    }

}
