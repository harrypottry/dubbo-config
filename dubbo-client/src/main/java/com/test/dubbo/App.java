package com.test.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                (new String[]{"dubbo-client.xml"});
        context.start();
        // 获取远程服务代理
        IGpHello demoService = (IGpHello) context.getBean("demoService");
        // 执行远程方法
        String hello = demoService.sayHello("world");
        // 显示调用结果
        System.out.println(hello);

    }
}
