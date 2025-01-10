package com.example.studentmanagementsystem.students;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentCreate(Student student) {

        return studentRepository.save(student);
    }


    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public Student getStudent(Integer id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> allStudents() {
        return studentRepository.findAll();
    }
}
