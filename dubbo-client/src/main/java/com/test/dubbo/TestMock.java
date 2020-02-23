package com.test.dubbo;

/**
 * @author harrypotter
 */
public class TestMock implements IGpHello{

    @Override
    public String sayHello(String s) {

        return "系统繁忙："+s;
    }
}
