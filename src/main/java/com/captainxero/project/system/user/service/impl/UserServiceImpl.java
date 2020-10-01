package com.captainxero.project.system.user.service.impl;

import com.captainxero.project.system.user.entity.User;
import com.captainxero.project.system.user.dao.UserMapper;
import com.captainxero.project.system.user.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Captainxero
 * @since 2018-06-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */

    @Override
    public User selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
