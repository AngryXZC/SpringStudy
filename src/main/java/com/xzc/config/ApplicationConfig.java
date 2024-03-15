package com.xzc.config;

import com.xzc.condition.MyCondition;
import com.xzc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xzc
 * @date 2024/3/4 15 15:51
 * @description
 */
@PropertySource("classpath:application.properties")
@ComponentScan("com.xzc.entity")
@Conditional(MyCondition.class)
public class ApplicationConfig {
    @Bean

    public User user() {
        User user = new User();
//        user.setName("xzc");
//        user.setAge(18);
        return user;
    }
}
