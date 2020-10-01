package com.captainxero.project.system.user.controller;


import com.captainxero.project.system.user.dao.UserMapper;
import com.captainxero.project.system.user.entity.User;
import com.captainxero.project.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Captainxero
 * @since 2018-06-05
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

//    简单登录验证
    @PostMapping("/check")
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){
//        User exampleUser = userMapper.selectById(username);
        User loginUser = userMapper.selectUserByName(username);
        String userPassword = loginUser.getPassword();
        System.out.println(userPassword);
//        String userPassword = exampleUser.getPassword();
        if(userPassword.equals(password)){
            return "index";
        }else {
            map.put("msg","用户名密码错误");
            return "login";
        }
    }

    @GetMapping("/select")
    @ResponseBody
    public User selectUser(){
        // 查询 User
        User exampleUser = userMapper.selectById(1);
        return exampleUser;
    }

}

