// The custom exception
package com.asher.Student_management.Exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message+" This is the custom exception class for Student Not Found Exception");
    }
}