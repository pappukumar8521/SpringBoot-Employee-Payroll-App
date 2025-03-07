package com.payroll.controller;

import com.payroll.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@RestController
@RequestMapping("/employees")
@Validated
public class EmployeeController {

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok("Employee created successfully: " + employee.getName());
    }
}
