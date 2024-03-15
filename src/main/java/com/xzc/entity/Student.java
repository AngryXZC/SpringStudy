package com.xzc.entity;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xzc
 * @date 2024/3/4 15 31:53
 * @description
 */
//通过@Beans生成
//public class Student  implements InitializingBean , DisposableBean , BeanFactoryAware ,BeanNameAware,EnvironmentAware {
    ////    @Autowired
////    @Resource
//    @Inject
//    private User user;
//
//    public Student(User user) {
//        this.user = user;
//    }
//    public Student(){
//        System.out.println("初始化Student对象....");
//    }
//
//
////    public void setUser(User user) {
////        this.user = user;
////    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "user=" + user +
//                '}';
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("成员属性注入后执行（执行初始化方法....）");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("销毁Student对象....");
//    }
//    public void show(){
//        System.out.println("执行Student基本方法"+this.user);
//    }
//    @PostConstruct
//    public void postConstruct(){
//        System.out.println("postConstruct:执行初始化方法....");
//
//    }
//    @PreDestroy
//    public void preDestroy(){
//        System.out.println("preDestroy:销毁Student对象....");
//
//    }
//
//    private void initMethod() {
//        System.out.println("initMethod:执行初始化方法....");
//    }
//
//    private void destroyMethod() {
//        System.out.println("destroyMethod:销毁Student对象....");
//    }
//
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("beanFactory："+beanFactory);
//    }
//
//    @Override
//    public void setEnvironment(Environment environment) {
//        System.out.println("beanFactory："+environment);
//    }
//
//    @Override
//    public void setBeanName(String s) {
//
//    }
//}

//扫包
@Component
public class Student implements InitializingBean, DisposableBean, BeanNameAware, EnvironmentAware {

    private AtomicInteger atomicInteger= new AtomicInteger(0);

    public Student(){
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tstudent初始化.....");
    }
    @Autowired
    private User user;

    @Override
    public void setBeanName(String name) {
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tBeanNameAware:"+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tDisposableBean:destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tInitializingBean:afterPropertiesSet");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tEnvironmentAware:"+environment);
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tpostConstruct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\tpreDestroy");
    }
    public void query(){
        System.out.println("序号："+atomicInteger.incrementAndGet()+"\t普通调用查询方法....");
    }
}

