package com.tulun.service.impl;

import com.tulun.bean.User;
import com.tulun.service.IUserService;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * 描述:
 * 在分布式服务提供方的子项目中，写的就是我们原来
 * 项目中从service层往下的都在这里实现
 * service + dao
 *
 * @Author shilei
 * @Date 2019/2/19
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User login(String name, String pwd) {
        if(name.equals("zhang san")
                && pwd.equals("111")){
            return new User(1000, "zhang san", 20, "男");
        }
        return null;
    }
}
