package com.qfedu.controller;

import com.qfedu.entity.Emp;
import com.qfedu.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private IEmpService empService;
    @GetMapping("/Emps")
    public List<Emp> getAllEmps(){
        return empService.getAllEmps();
    }
}
