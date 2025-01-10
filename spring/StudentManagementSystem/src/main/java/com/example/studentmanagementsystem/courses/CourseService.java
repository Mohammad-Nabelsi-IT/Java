package com.example.studentmanagementsystem.courses;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;


    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    Course courseCreate(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    public void delete(Course course) {
        courseRepository.delete(course);
    }

    public Course getCourse(Integer id) {
        return courseRepository.findById(id).get();
    }
}
