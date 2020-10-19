package com.captainxero.project.service.impl;

import com.captainxero.project.dao.UserMapper;
import com.captainxero.project.entity.User;
import com.captainxero.project.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
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
    public User selectUserById(String userId) {
        return userMapper.selectUserById(userId);
    }
}
