package com.example.hr.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee creatEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }
}
