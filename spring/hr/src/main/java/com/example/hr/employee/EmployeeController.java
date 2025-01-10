package com.example.hr.employee;

import com.example.hr.department.Department;
import com.example.hr.department.DepartmentService;
import com.example.hr.job.Job;
import com.example.hr.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    public JobService jobService;


    @PostMapping("/create")
    public String create(@RequestParam(value = "first_name") String first_name,
                         @RequestParam(value = "last_name") String last_name,
                         @RequestParam(value = "email") String email,
                         @RequestParam(value = "phone") String phone,
                         @RequestParam(value = "job_id") int job_id,
                         @RequestParam(value = "department_id") int department_id) {

        Department department = departmentService.getDepartment(department_id);
        Job job = jobService.getJob(job_id);
        Employee employee = new Employee();
        employee.setFirst_name(first_name);
        employee.setLast_name(last_name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJob(job);
        employee.setDepartment(department);
        employeeService.creatEmployee(employee);

        return "redirect:/employee/show";
    }

    @GetMapping("/show")
        public String show(Model model) {
        model.addAttribute("depts", departmentService.allDept());
        model.addAttribute("jobs", jobService.allJobs());
        model.addAttribute("employees", employeeService.allEmployees());
        return "employee";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Employee employee = employeeService.getEmployee(id);
        employeeService.delete(employee);
        return "redirect:/employee/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") Integer id) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        model.addAttribute("depts", departmentService.allDept());
        model.addAttribute("jobs", jobService.allJobs());
        return "employee_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "first_name") String first_name
            , @RequestParam(value = "last_name") String last_name
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "phone") String phone
            , @RequestParam(value = "job_id") Integer job_id
            , @RequestParam(value = "department_id") Integer department_id) {
        Department department = departmentService.getDepartment(department_id);
        Job job = jobService.getJob(job_id);
        Employee employee = employeeService.getEmployee(id);
        employee.setFirst_name(first_name);
        employee.setLast_name(last_name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJob(job);
        employee.setDepartment(department);
        employee = employeeService.creatEmployee(employee);
        return "redirect:/employee/show";


    }

}
