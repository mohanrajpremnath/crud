package com.bluemoon.rest.controller;

import com.bluemoon.rest.model.Employee;
import com.bluemoon.rest.service.BlueMoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/electronics", consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public class BlueMoonController {

    @Autowired
    BlueMoonService blueMoonService;

    @GetMapping("/home")
    public ResponseEntity<String> getHelloWorld() {
        String response = "Hello, there? It's me Hello World!";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/shops")
    public String getGreetings() {
        return "Hello, there? Happy day!";
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return blueMoonService.createEmployee(employee);
    }

}
