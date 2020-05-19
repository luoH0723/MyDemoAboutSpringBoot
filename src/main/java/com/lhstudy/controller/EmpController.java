package com.lhstudy.controller;

import com.lhstudy.pojo.Emp;
import com.lhstudy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //获取员工列表
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps=empService.findAll();
        model.addAttribute("emps",emps);
        return "ems/emplist";
    }

}
