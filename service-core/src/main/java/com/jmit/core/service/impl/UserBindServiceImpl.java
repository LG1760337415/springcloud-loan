package com.jmit.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.core.dao.UserBindMapper;
import com.jmit.core.pojo.entity.UserBind;
import com.jmit.core.service.UserBindService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {

}
