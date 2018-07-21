package com.pinyougou.shop.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录控制
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    /**
     * 通过Security显示登录名
     * @return
     */
    @RequestMapping("/name")
    public Map showLoginName(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map<String,String> map=new HashMap<>();
        map.put("loginName",name);
        return map;
    }
}
