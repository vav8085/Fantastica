package com.vav.designPatterns.StructuralPatterns.Bridge;

/**
 * Created by z179905 on 1/18/17.
 */
public class DirectxWindowsImpl extends WindowImpl {
    @Override
    public void draw(int width, int height) {
        System.out.println("This is a Directx window");
    }
}
