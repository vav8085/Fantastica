package com.vav.designPatterns.StructuralPatterns.AdapterPattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class AdapterPatternClient {
    public static void main (String arg[]){
        OldRobot oldRobot = new OldRobot();
        OldRobotAdapter oldRobotAdapter = new OldRobotAdapter(oldRobot);
        oldRobotAdapter.shoot();
        oldRobotAdapter.walk();
    }
}
