package com.asher.Student_management.DTO;

public class StudentRequestDTO {

    private String name;
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