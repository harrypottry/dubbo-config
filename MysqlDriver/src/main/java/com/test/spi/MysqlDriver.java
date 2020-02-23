package com.test.spi;

/**
 * @author harrypotter
 */
public class MysqlDriver implements DataBaseDriver{

    @Override
    public String connect(String s) {
        return "begin build Mysql connection";
    }
}
