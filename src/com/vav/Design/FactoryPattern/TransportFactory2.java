package com.vav.Design.FactoryPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class TransportFactory2 extends TransportFactory {

    @Override
    public Transport create() {
        return null;
    }

    @Override
    public Transport create(String type) {
        if(type.equals("car")){
            return new Car();
        }else if(type.equals("bike")){
            return new Bike();
        }else return new Car();
    }
}
