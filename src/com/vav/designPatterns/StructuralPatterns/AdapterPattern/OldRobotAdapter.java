package com.vav.designPatterns.StructuralPatterns.AdapterPattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class OldRobotAdapter implements Robot {
    OldRobot oldRobot ;
    public OldRobotAdapter(OldRobot oldRobot){
        this.oldRobot = oldRobot;
    }
    @Override
    public void walk() {
        oldRobot.roll();
    }

    @Override
    public void shoot() {
        oldRobot.hammer();
    }
}
