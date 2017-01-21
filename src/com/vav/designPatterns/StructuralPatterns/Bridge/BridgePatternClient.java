package com.vav.designPatterns.StructuralPatterns.Bridge;

/**
 * Created by z179905 on 1/18/17.
 */
public class BridgePatternClient {
    public static void main(String arg[]){
        IconWindow iconWindow = new IconWindow();
        iconWindow.setImplementation(new LinuxWindowImpl());
        iconWindow.drawIcon();
    }
}
