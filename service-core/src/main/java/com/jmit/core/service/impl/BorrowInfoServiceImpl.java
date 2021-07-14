package com.jmit.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.core.dao.BorrowInfoMapper;
import com.jmit.core.pojo.entity.BorrowInfo;
import com.jmit.core.service.BorrowInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款信息表 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class BorrowInfoServiceImpl extends ServiceImpl<BorrowInfoMapper, BorrowInfo> implements BorrowInfoService {

}
