package com.jmit.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jmit.core.pojo.entity.Dict;
import com.jmit.core.pojo.entity.ExcelDictDTO;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
public interface DictService extends IService<Dict> {
    void importData(InputStream inputStream);
    List<ExcelDictDTO> listDictData();
    List<Dict> listByParentId(Long parentId);
}
