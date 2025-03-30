package com.bluemoon.rest.repository;

import com.bluemoon.rest.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class BlueMoonRespository {

    public Employee createEmployee(Employee employee) {
        return employee;
    }

}
