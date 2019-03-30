package com.tulun.controller;

import com.tulun.bean.User;
import com.tulun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:
 *
 * @Author shilei
 * @Date 2019/2/19
 */
@Controller
public class UserController {

    @Autowired
    private IUserService ius;

    @RequestMapping(value = "/")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String name, String pwd){
        User user = ius.login(name, pwd);
        if(user != null){
            return "login success!";
        } else {
            return "login error!!!";
        }
    }
}
