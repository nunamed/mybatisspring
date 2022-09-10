package com.Controller;


import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.pojo.User;
@Controller
public class UserController {
    @Resource
    private User user;
    public void test(){
        System.out.println(user);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = (UserController) appCon.getBean("userController");
        uc.test();
    }
}
