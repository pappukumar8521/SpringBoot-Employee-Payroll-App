package com.payroll.controller;

import com.payroll.dto.EmployeeDTO;
import com.payroll.exception.EmployeeNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
@Validated
public class EmployeeController {

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok("Employee created successfully: " + employee.getName());
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable int id) {
        // Simulating Employee Not Found scenario
        if (id <= 0) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
        }
        return ResponseEntity.ok("Employee details for ID: " + id);
    }
}
