package com.atguigu.controller;

import com.atguigu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class TestController {
    @RequestMapping("/demo")
    public String hello(Model model){
        model.addAttribute("hello","欢迎来到英雄联盟");
        List<User> list = new ArrayList<>();
        list.add(new User(1,"张三","北京"));
        list.add(new User(2,"李四","上海"));
        list.add(new User(3,"王五","广东"));
        model.addAttribute("list",list);

        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("No",new User(1,"张三","北京"));
        dataMap.put("address","厦门");
        model.addAttribute("dataMap",dataMap);

        Integer[] num = {1,2,3,4,5};
        model.addAttribute("num",num);
        model.addAttribute("now",new Date());

        model.addAttribute("age",13);
        return "demo1";


    }

}
