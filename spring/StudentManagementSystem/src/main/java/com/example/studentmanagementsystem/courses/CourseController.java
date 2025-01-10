package com.example.studentmanagementsystem.courses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;

    }

    @PostMapping("/create")
    String add(@RequestParam(value = "name") String name,
               @RequestParam(value = "description") String description) {
        Course course = new Course();
        course.setName(name);
        course.setDescription(description);
        return "redirect:/courses/show";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("courses", courseService.allCourses());
        return "course";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Course course = courseService.getCourse(id);
        courseService.delete(course);
        return "redirect:/courses/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") Integer id) {
        Course course = courseService.getCourse(id);
        model.addAttribute("course", course);
        return "job_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "description") String description) {
        Course course = courseService.getCourse(id);
        course.setName(name);
        course.setDescription(description);


        course = courseService.courseCreate(course);
        return "redirect:/course/show";


    }
}
