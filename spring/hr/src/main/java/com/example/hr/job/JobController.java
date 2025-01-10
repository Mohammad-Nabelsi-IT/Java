package com.example.hr.job;

import com.example.hr.department.Department;
import com.example.hr.employee.Employee;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobs")
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/create")
    public String creat(@RequestParam(value = "name") String name,
                        @RequestParam(value = "salary") double salary) {
        Job job = new Job();
        job.setName(name);
        job.setSalary(salary);
        job = jobService.createJob(job);
        return "redirect:/jobs/show";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("jobs", jobService.allJobs());
        return "job";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Job job = jobService.getJob(id);
        jobService.delete(job);
        return "redirect:/jobs/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") Integer id) {
        Job job = jobService.getJob(id);
        model.addAttribute("job", job);
        return "job_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "salary") String salary) {
        Job job = jobService.getJob(id);
        job.setName(name);
        job.setSalary(Double.parseDouble(salary));

        job = jobService.createJob(job);
        return "redirect:/jobs/show";


    }
}
