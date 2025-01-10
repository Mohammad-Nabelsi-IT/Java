package com.example.studentmanagementsystem.enrollments;

import com.example.studentmanagementsystem.students.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/enrollments")
public class EnrollmentController {
    private final StudentService studentService;
    private EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService, StudentService studentService) {
        this.enrollmentService = enrollmentService;
        this.studentService = studentService;
    }

    @PostMapping("/create")
    String add(@RequestParam(value = "student_id") String studentId
            , @RequestParam(value = "course_id") String courseId
            , @RequestParam(value = "enrollment_date") LocalDate enrollmentDate) {

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentId(studentId);
        enrollment.setCourseId(courseId);
        enrollment.setEnrollmentDate(enrollmentDate);
        return "redirect:/enrollments/show";

    }


    @GetMapping("/show")
    public String show(Model model) {
        List<Enrollment> enrollment = enrollmentService.allEnrollments();
        model.addAttribute("enrollment", enrollment);
        return "enrollment";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Enrollment enrollment = enrollmentService.getEnrollment(id);
        enrollmentService.delete(enrollment);
        return "redirect:/enrollments/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Enrollment enrollment = enrollmentService.getEnrollment(id);
        model.addAttribute("enrollment", enrollment);
        return "enrollment_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "student_id") String studentId
            , @RequestParam(value = "course_id") String courseId
            , @RequestParam(value = "enrollment_date") LocalDate enrollmentDate) {

        Enrollment enrollment = enrollmentService.getEnrollment(id);
        enrollment.setStudentId(studentId);
        enrollment.setCourseId(courseId);
        enrollment.setEnrollmentDate(enrollmentDate);
        return "redirect:/enrollments/show";
    }
}