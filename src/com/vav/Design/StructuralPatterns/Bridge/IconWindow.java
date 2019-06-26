package com.vav.Design.StructuralPatterns.Bridge;

/**
 * Created by z179905 on 1/18/17.
 */
public class IconWindow extends Window {

    public void drawIcon(){
        windowImpl.draw(0,0);
    }
}
