package com.example.lec2.Controller;

import com.example.lec2.DBConfig;
import model.DeparntmentDAO;
import model.Department;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @PostMapping("/create")
    String save(@RequestParam(value = "name") String name
            , @RequestParam(value = "manager") String manager
    ) {
        Department department = new Department();
        department.setName(name);
        department.setManager(manager);
        // save db
        try {
            DeparntmentDAO  dp=new DeparntmentDAO(DBConfig.createConnection());
            dp.add(department);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return department.toString();
    }


}
