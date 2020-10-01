package com.captainxero.project.system.user.dao;

import com.captainxero.project.system.user.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author Captainxero
 * @since 2018-06-05
 */

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from sys_user where login_name = #{loginName}")
    User selectUserByName(String loginName);
}
