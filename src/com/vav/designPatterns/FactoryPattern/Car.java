package com.vav.designPatterns.FactoryPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class Car extends Transport {
    @Override
    public void drive() {
        System.out.print("Car driving!");
    }
}
