package com.vav.Design.StructuralPatterns.Bridge;

/**
 * Created by z179905 on 1/18/17.
 */
public class Window {
    WindowImpl windowImpl;

    public void draw(int left, int right){

    }

    public void setImplementation(WindowImpl windowImpl){
        this.windowImpl = windowImpl;
    }
}
