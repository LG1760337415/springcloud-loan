package com.jmit.core.controller.admin;

import com.alibaba.excel.EasyExcel;
import com.jmit.common.exception.BusinessException;
import com.jmit.common.result.R;
import com.jmit.common.result.ResponseEnum;
import com.jmit.core.pojo.entity.Dict;
import com.jmit.core.pojo.entity.ExcelDictDTO;
import com.jmit.core.pojo.entity.IntegralGrade;
import com.jmit.core.service.DictService;
import com.jmit.core.service.IntegralGradeService;
import com.sun.deploy.net.URLEncoder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "积分等级管理")
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;
    @Resource
    private DictService dictService;

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll(){
        int i = 1/0;
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }

    @ApiOperation(value = "根据id删除积分等级", notes="逻辑删除")
    @DeleteMapping("/remove/{id}")
    public R removeById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id){
        boolean result = integralGradeService.removeById(id);
        if(result){
            //return R.setResult(ResponseEnum.UPLOAD_ERROR);
            return R.ok().message("删除成功");
        }else{
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade){
        //如果借款额度为空就手动抛出一个自定义的异常！
        if(integralGrade.getBorrowAmount() == null){
            //BORROW_AMOUNT_NULL_ERROR(-201, "借款额度不能为空"),
            throw new BusinessException(ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        }

        boolean result = integralGradeService.save(integralGrade);
        if (result) {
            return R.ok().message("保存成功");
        } else {
            return R.error().message("保存失败");
        }

    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get/{id}")
    public R getById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id
    ){
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if(integralGrade != null){
            return R.ok().data("record", integralGrade);
        }else{
            return R.error().message("数据不存在");
        }
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public R updateById(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.updateById(integralGrade);
        if(result){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }

}