package com.tulun.service;

import com.tulun.bean.User;

/**
 * 描述:
 * api是服务提供方和服务消费方都会使用的公共接口和类
 * @Author shilei
 * @Date 2019/2/19
 */
public interface IUserService {
    /**
     * 登录检测功能
     * @param name
     * @param pwd
     * @return
     */
    User login(String name, String pwd);
}
