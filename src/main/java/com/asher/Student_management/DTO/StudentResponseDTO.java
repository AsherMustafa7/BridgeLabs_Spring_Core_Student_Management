package com.asher.Student_management.DTO;

public class StudentResponseDTO {

    private Integer id;
    private String name;
    private String department;
    private String message;

    public StudentResponseDTO() {
    }

    public StudentResponseDTO(Integer id,String name,String department,String message) 
    {

        this.id = id;
        this.name = name;
        this.department = department;
        this.message = message;
        // the response can contain an extra filed
        // The message field does not need to exist in your Student database table.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}