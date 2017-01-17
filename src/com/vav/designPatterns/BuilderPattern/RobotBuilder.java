package com.vav.designPatterns.BuilderPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public interface RobotBuilder {
    public void buildRobotHead();
    public void buildRobotTorso();
    public Robot getRobot();
}
