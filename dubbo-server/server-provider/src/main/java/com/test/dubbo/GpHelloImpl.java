package com.test.dubbo;

/**
 * @author harrypotter
 */
public class GpHelloImpl implements IGpHello{

    @Override
    public String sayHello(String msg) {
        System.out.println("Server receive:"+msg);
        return "Hello,"+msg;
    }
}
