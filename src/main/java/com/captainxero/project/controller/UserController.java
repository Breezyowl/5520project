package com.captainxero.project.controller;


import com.captainxero.project.entity.User;
import com.captainxero.project.service.UserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author Ming
 * @since 
 */

@Api(value="用户登录页查询接口",tags={"UserController"})
@RestController
@RequestMapping("/sys")
public class UserController {

    @Autowired
    private UserService userService;
    
    private static final Logger logger = LogManager.getLogger(UserController.class);
    
    // 简单登录验证
    @ApiOperation(value="获取用户信息", notes="登录系统")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping(value="/login", method=RequestMethod.GET)
    @ResponseBody
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){
        User loginUser = userService.selectUserByName(username);
        String userPassword = loginUser.getPassword();

        if(userPassword.equals(password)){
            return "True";
        }else {
            map.put("msg","用户名密码错误");
            return "False";
        }
    }


}

