package com.jmit.service.core.controller;

import com.jmit.service.core.pojo.entity.IntegralGrade;
import com.jmit.service.core.service.IntegralGradeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    public List<IntegralGrade> listAll(){
//        integralGradeService.
        return integralGradeService.list();
    }
}