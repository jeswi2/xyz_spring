package com.nestdigital.xyzbackend.controller;

import com.nestdigital.xyzbackend.Model.StudentModel;
import com.nestdigital.xyzbackend.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studententry",consumes = "application/json",produces = "application/json")
    public String studententry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<StudentModel>view(){
        return (List<StudentModel>) dao.findAll();

    }

    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletestudent",consumes = "application/json",produces = "application/json")
    public String deletestudent(@RequestBody StudentModel student){
        dao.deleteStudentId(student.getId());
        return "{status:'success'";
    }
}
