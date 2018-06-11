package com.wb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:application-customtag.xml");
        User user=(User)context.getBean("origin");
        System.out.println(user);


        System.out.println(context.getBean("testBean"));

        User user2=(User)context.getBean("testBean");
        System.out.println(user2);
        System.out.println("username:"+user2.getUserName()+":"+"email:"+user2.getEmail());
    }
}
