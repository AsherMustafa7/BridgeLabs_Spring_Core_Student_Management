package com.asher.Student_management.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.asher.Student_management.Entity.Student;
@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {
    
}
