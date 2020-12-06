package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @Author: wxf
 * @Date: 2020/12/6 14:09
 * @Description:
 */
@Controller       //注意：如果使用thymeleaf模板引擎，则该注解一定要是@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","欢迎来到优就业");
        return "index";
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/findUser")
    public String findUser(Model model){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(33);

        Map<String,String> map = new HashMap<>();
        map.put("id","2");
        map.put("name","李四");
        map.put("age","男");


        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index02";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(33);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("李四");
        user2.setAge(22);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("张柳");
        user3.setAge(75);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("userList",list);
        return "index03";
    }

    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("username","张三");
        return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","yes");

        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index05";
    }


    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date",new Date());

        model.addAttribute("num",0.456D);
        model.addAttribute("str","Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\n");
        return "index06";
    }

}
