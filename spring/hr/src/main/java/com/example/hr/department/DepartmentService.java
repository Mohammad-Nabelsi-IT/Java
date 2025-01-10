package com.example.hr.department;

import com.example.hr.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> allDept() {
        return departmentRepository.findAll();
    }

    public void delete(Department department) {
        departmentRepository.delete(department);

    }

    public Department getDepartment(Integer id) {
        return departmentRepository.findById(id).get();
    }


}