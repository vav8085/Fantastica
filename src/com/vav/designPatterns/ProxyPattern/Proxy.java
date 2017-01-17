package com.vav.designPatterns.ProxyPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class Proxy {
    Graphic graphic;
    Proxy(Graphic graphic){
        this.graphic= graphic;
    }
    public Graphic duplicate(){
        return graphic.clone();
    }
}
