package com.asher.Student_management.Service;

import org.springframework.stereotype.Service;
import com.asher.Student_management.Repository.Student_Repository;
import com.asher.Student_management.Entity.Student;
import java.util.List;
import java.util.Optional;
import com.asher.Student_management.DTO.StudentRequestDTO;
import com.asher.Student_management.DTO.StudentResponseDTO;

@Service 
public class Student_Service 
{
    private final Student_Repository studentRepository;
    
    public Student_Service(Student_Repository studentRepository) {
        this.studentRepository = studentRepository;
    }
    // ---------------------------------------------------------------
    public StudentResponseDTO addStudent(StudentRequestDTO request) 
    {
        Student student = new Student();
        student.setName(request.getName());
        student.setDepartment(request.getDepartment());
        Student savedStudent = studentRepository.save(student);
        String message = "Student added successfully with ID: " + savedStudent.getId();
        return new StudentResponseDTO(savedStudent.getId(), savedStudent.getName(), savedStudent.getDepartment(), message);
    }
    // ---------------------------------------------------------------

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id)
    {
        return studentRepository.findById(id);
    }

    public Optional<Student> updateStudent(int id ,Student updateds)
    {
        Optional<Student> Optionalstd= studentRepository.findById(id);

        if(Optionalstd.isPresent())
        {
            Student student= Optionalstd.get();
            student.setDepartment(updateds.getDepartment());
            student.setName(updateds.getName());
            return Optional.of(studentRepository.save(student));
        }
        return Optional.empty();
    }
    

    public boolean deleteStudentById(int id)
    {
        Optional<Student> opts= studentRepository.findById(id);
        if(opts.isPresent())
        {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
