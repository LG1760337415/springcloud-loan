package com.jmit.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jmit.core.pojo.entity.Dict;
import com.jmit.core.pojo.entity.ExcelDictDTO;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<ExcelDictDTO> list);

}
