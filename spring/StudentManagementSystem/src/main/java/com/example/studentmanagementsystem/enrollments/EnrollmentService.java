package com.example.studentmanagementsystem.enrollments;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;


    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public Enrollment enrollmentCreate(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> allEnrollments() {
        return enrollmentRepository.findAll();
    }

    public void delete(Enrollment enrollment) {
        enrollmentRepository.delete(enrollment);

    }

    public Enrollment getEnrollment(Integer id) {
        return enrollmentRepository.findById(id).get();
    }
}
