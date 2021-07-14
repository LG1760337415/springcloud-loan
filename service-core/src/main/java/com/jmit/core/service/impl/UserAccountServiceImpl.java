package com.jmit.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jmit.core.dao.UserAccountMapper;
import com.jmit.core.pojo.entity.UserAccount;
import com.jmit.core.service.UserAccountService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author Helen
 * @since 2021-02-20
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
