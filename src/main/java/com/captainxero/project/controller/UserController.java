package com.captainxero.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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
    
	public static final String SUCCESS = "SUCCESS";
	public static final String EXCEPTION = "EXCEPTION:";
    // 简单登录验证
    @ApiOperation(value="获取用户信息", notes="登录系统")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "用户id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping(value="/login", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> checkLogin(HttpServletResponse response,@RequestParam("userid") String userid, @RequestParam("password") String password){
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);

//        if(userPassword.equals(password)){
//        	Cookie user = new Cookie("userid", userid);
//        	response.addCookie(user);
//            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
//        }else {
//            return new ResponseEntity<String>(EXCEPTION + "用户名密码错误", HttpStatus.OK);
//        }
    }
    
    


}

