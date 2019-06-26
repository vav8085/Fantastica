package com.vav.Design.FactoryPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class FactoryClient {
    public static void main(String arg[]){
        TransportFactory carFactory = new CarFactory();
        carFactory.create();
    }
}
