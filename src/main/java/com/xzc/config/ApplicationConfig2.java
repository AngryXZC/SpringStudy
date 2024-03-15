package com.xzc.config;

import com.xzc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xzc
 * @date 2024/3/15 11 08:37
 * @description
 */
@ComponentScan("com.xzc.entity")
@PropertySource("classpath:application.properties")
public class ApplicationConfig2 {
//    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
//    public Student student(){
//        return new Student();
//    }

}
