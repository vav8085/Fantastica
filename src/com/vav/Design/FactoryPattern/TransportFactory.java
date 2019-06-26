package com.vav.Design.FactoryPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public abstract class TransportFactory {
    public abstract Transport create();
    public abstract Transport create(String s);
}
