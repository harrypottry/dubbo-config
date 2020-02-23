package com.test.spi;

/**
 * @author harrypotter
 */
public class OracleDriver implements DataBaseDriver{

    @Override
    public String connect(String s) {
        return "Build connection With Oracle:"+s;
    }
}
