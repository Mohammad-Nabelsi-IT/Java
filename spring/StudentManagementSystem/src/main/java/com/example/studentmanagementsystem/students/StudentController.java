package com.example.studentmanagementsystem.students;


import com.example.studentmanagementsystem.courses.Course;
import com.example.studentmanagementsystem.courses.CourseService;
import com.example.studentmanagementsystem.enrollments.Enrollment;
import com.example.studentmanagementsystem.enrollments.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

import static java.time.LocalDate.parse;

@Controller
@RequestMapping("students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    private EnrollmentService enrollmentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Autowired
    public CourseService courseService;


    @PostMapping("/create")
    String add(@RequestParam(value = "first_name") String firstName
            , @RequestParam(value = "last_name") String lastName
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "dob") String dob
            , @RequestParam(value = "courses_id") int courses_id
            , @RequestParam(value = "enrollments_id") int enrollments_id) {

        Enrollment enrollment = enrollmentService.getEnrollment(enrollments_id);
        Course course = courseService.getCourse(courses_id);

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        student.setDateOfBirth(parse(dob));
        studentService.studentCreate(student);
        return "redirect:/students/show";

    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("enrollments", enrollmentService.allEnrollments());
        model.addAttribute("courses", courseService.allCourses());
        model.addAttribute("students", studentService.allStudents());
        return "student";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Student student = studentService.getStudent(id);
        studentService.delete(student);
        return "redirect:/students/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") Integer id) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        model.addAttribute("enrollments", enrollmentService.allEnrollments());
        model.addAttribute("courses", courseService.allCourses());
        return "student_edit";
    }

    @GetMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "first_name") String first_name
            , @RequestParam(value = "last_name") String last_name
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "date_of_birth") String date_of_birth) {

        Student student = studentService.getStudent(id);
        student.setFirstName(first_name);
        student.setLastName(last_name);
        student.setEmail(email);
        student.setDateOfBirth(LocalDate.parse(date_of_birth));
        student = studentService.studentCreate(student);
        return "redirect:/students/show";

    }


}
