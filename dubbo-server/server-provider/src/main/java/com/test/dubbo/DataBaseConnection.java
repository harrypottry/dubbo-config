package com.test.dubbo;

import com.test.spi.DataBaseDriver;

import java.util.ServiceLoader;

/**
 * @author harrypotter
 */
public class DataBaseConnection {

    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader=
                ServiceLoader.load(DataBaseDriver.class);

        for(DataBaseDriver driver:serviceLoader){
            System.out.println(driver.connect("localhost"));
        }
    }
}
