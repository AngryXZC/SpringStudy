package com.xzc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xzc
 * @date 2024/3/4 15 01:09
 * @description
 */
@Component
public class User {
    @Value("${xzc.user.name}")
    private String name;
    @Value("${xzc.user.age}")
    private Integer age;

    public User(){
        System.out.println("初始化User对象....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
