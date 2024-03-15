package com.xzc.test;

import com.xzc.config.ApplicationConfig;
import com.xzc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xzc
 * @date 2024/3/15 10 11:01
 * @description
 */
public class Test03 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        User user=context.getBean("user",User.class);
        System.out.println(user);
    }
}
