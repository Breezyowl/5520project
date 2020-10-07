package com.captainxero.project.service;

import com.baomidou.mybatisplus.service.IService;
import com.captainxero.project.entity.User;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Captainxero
 * @since 2018-06-05
 */
public interface UserService extends IService<User> {
    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    User selectUserByName(String userName);
}
