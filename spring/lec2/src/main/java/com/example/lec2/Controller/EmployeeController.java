package com.example.lec2.Controller;

import com.example.lec2.DBConfig;
import model.Employee;
import model.EmployeeDAO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/create")
    String save(@RequestParam(value = "first_name")String fName
            , @RequestParam(value = "last_name")String lName
            , @RequestParam(value = "email")String email
            , @RequestParam(value = "phone")String phone
            , @RequestParam(value = "job")String job
    ){
        Employee emp1 = new Employee();
        emp1.setfName(fName);
        emp1.setlName(lName);
        emp1.setEmail(email);
        emp1.setPhone(phone);
        emp1.setJob(job);

        try {
            EmployeeDAO employeeDAO = new EmployeeDAO(DBConfig.createConnection());
            employeeDAO.add(emp1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return emp1.toString();
    }
}
