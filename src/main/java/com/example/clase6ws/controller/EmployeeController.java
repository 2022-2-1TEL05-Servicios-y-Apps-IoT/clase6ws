package com.example.clase6ws.controller;

import com.example.clase6ws.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {

    final
    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("")
    public ResponseEntity<HashMap<String,Object>> listar(){
        HashMap<String,Object> responseJson = new HashMap<>();

        responseJson.put("estado","ok");
        responseJson.put("lista",employeeRepository.findAll());
        return ResponseEntity.ok(responseJson);
    }
}
