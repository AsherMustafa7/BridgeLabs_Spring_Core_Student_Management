package com.asher.Student_management.Service;

import org.springframework.stereotype.Service;
import com.asher.Student_management.Repository.Student_Repository;
import com.asher.Student_management.Entity.Student;
import com.asher.Student_management.Exception.StudentNotFoundException;

import java.util.List;
import java.util.Optional;
@Service 
public class Student_Service 
{
    private final Student_Repository studentRepository;
    
    public Student_Service(Student_Repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    // -------------------------------------------------------------
    // public Optional<Student> getStudentById(int id)
    // {
    //     return studentRepository.findById(id);
    // }

    public Optional<Student> getStudentById(int id) 
    {

        Student s= studentRepository.findById(id).orElseThrow(() ->new StudentNotFoundException("Student with ID " + id + " not found"));
        // please none that orElseThrow() kind of returns the actual student object and not 
        // the students, So that why we are doing this cause the controller methord expects and optional
        return Optional.of(s);
    }
    // -------------------------------------------------------------

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
