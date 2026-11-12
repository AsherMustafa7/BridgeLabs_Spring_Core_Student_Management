
package com.asher.Student_management.Validation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DepartmentValidator implements ConstraintValidator<ValidDepartment, String> {

    private final List<String> validDepartments = Arrays.asList("CSE", "IT", "ECE", "EEE", "MECH");

    @Override
    public boolean isValid(String department,ConstraintValidatorContext context) 
    {
        if (department == null) {
            return true;
        }
        return validDepartments.contains(department.trim().toUpperCase());
    }
}
