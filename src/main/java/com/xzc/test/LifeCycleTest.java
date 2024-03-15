package com.xzc.test;

import com.xzc.config.ApplicationConfig;
import com.xzc.config.ApplicationConfig2;
import com.xzc.entity.Student;
import com.xzc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xzc
 * @date 2024/3/15 10 35:37
 * @description
 */
public class LifeCycleTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
        Student student=context.getBean("student", Student.class);
        student.query();
        System.out.println("IOC容器开始关闭....");
        context.registerShutdownHook();
    }
}
