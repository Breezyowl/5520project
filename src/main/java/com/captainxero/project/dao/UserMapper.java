package com.captainxero.project.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.captainxero.project.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author Captainxero
 * @since 2018-06-05
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from sys_user where login_name = #{loginName}")
    User selectUserByName(String loginName);
}
