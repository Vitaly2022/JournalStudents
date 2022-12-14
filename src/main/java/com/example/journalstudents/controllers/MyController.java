package com.example.journalstudents.controllers;

import com.example.journalstudents.repository.MyRepositorry;
import com.example.journalstudents.table.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
//@RequestMapping
public class MyController {

        @Autowired
        private MyRepositorry myRepositorry;

    @GetMapping("/test")
    public String selecGroup() {

        return "test";
    }

    @GetMapping("/findAll") //путь контроллера склеивается с этим путем
    public String selecGroup(ModelMap bd) {
        List<Student> students = myRepositorry.findAll();
        bd.put("stud", students);
        return "findAll";
    }
}
