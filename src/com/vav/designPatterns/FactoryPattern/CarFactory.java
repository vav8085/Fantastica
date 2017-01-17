package com.vav.designPatterns.FactoryPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class CarFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Car();
    }

    @Override
    public Transport create(String s) {
        return null;
    }
}
