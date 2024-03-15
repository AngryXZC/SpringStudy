package com.xzc.test;

import com.xzc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xzc
 * @date 2024/3/4 16 49:40
 * @description
 */
public class Test02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
