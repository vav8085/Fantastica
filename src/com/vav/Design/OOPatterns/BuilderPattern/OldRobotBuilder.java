package com.vav.Design.BuilderPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder(){
        robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
