
package com.asher.Student_management.DTO;

import com.asher.Student_management.Validation.ValidDepartment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentRequestDTO {
    // ---------------------------------------------------------------
    @NotBlank(message = "Student name cannot be empty")
    @Size(min = 2, max = 50,message = "Student name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Department cannot be empty")
    @Size(min = 2, max = 30,message = "Department must be between 2 and 30 characters")
    @ValidDepartment(message = "Please select a valid department: CSE, IT, ECE, EEE or MECH")
    private String department;

    public StudentRequestDTO() {
    }

    public StudentRequestDTO(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
