package com.jmit.core.controller.admin;

import com.jmit.core.pojo.entity.IntegralGrade;
import com.jmit.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "积分等级管理")
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    public List<IntegralGrade> listAll(){
//        integralGradeService.
//        integralGradeService.
//        int i = 1/0;
        return integralGradeService.list();
    }

    @ApiOperation(value = "根据id删除积分等级", notes = "逻辑删除")
    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Long id){
        return integralGradeService.removeById(id);
    }
}