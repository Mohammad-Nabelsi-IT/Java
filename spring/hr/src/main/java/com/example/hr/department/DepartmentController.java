package com.example.hr.department;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/create")
    public String create(@RequestParam(value = "name") String name,
                         @RequestParam(value = "manager") String manager) {
        Department department = new Department();
        department.setName(name);
        department.setManager(manager);
        department = departmentService.createDepartment(department);
        return "redirect:/dept/show";
    }

    @GetMapping("/show")
    public String show(Model model) {

        List<Department> deps = departmentService.allDept();
        model.addAttribute("depts", deps);

        return "department";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Department dept = departmentService.getDepartment(id);
        departmentService.delete(dept);
        return "redirect:/dept/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Department dept = departmentService.getDepartment(id);
        model.addAttribute("dept", dept);
        return "department_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id,
                         @RequestParam(value = "name") String name
            , @RequestParam(value = "manager") String manager) {
        Department dept = departmentService.getDepartment(id);
        dept.setName(name);
        dept.setManager(manager);
        dept = departmentService.createDepartment(dept);
        return "redirect:/dept/show";
    }


}