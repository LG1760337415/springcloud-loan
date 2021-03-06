package com.jmit.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.core.dao.LendItemMapper;
import com.jmit.core.pojo.entity.LendItem;
import com.jmit.core.service.LendItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {

}
