package com.jmit.service.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.service.core.dao.OperateActionMapper;
import com.jmit.service.core.pojo.entity.OperateAction;
import com.jmit.service.core.service.OperateActionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作行为记录表 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class OperateActionServiceImpl extends ServiceImpl<OperateActionMapper, OperateAction> implements OperateActionService {

}
