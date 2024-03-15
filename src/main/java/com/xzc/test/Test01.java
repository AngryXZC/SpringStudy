package com.xzc.test;

import com.xzc.config.ApplicationConfig;
import com.xzc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xzc
 * @date 2024/3/4 14 51:44
 * @description
 */
public class Test01 {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        User user = context.getBean("user", User.class);
//        System.out.println(user);
        String[] beanDefinitionNames= context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
