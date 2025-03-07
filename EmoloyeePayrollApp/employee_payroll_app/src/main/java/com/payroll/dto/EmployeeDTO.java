package com.payroll.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z ]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    private String name;

    private int age;
    private String department;
}
