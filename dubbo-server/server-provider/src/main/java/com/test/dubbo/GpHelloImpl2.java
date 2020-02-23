package com.test.dubbo;

/**
 * @author harrypotter
 */
public class GpHelloImpl2 implements IGpHello{

    @Override
    public String sayHello(String msg) {
        return "Hello, Version2.0:"+msg;
    }
}
