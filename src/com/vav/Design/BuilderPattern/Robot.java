package com.vav.Design.BuilderPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class Robot implements RobotPlan {
    String robotHead, robotTorso;

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    @Override
    public void setRobotHead(String robotHead) {
        this.robotHead=robotHead;
    }

    @Override
    public void setRobotTorso(String robotTorso) {
        this.robotTorso = robotTorso;
    }
}
