package com.vav.designPatterns.BuilderPattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class RobotDirector {
private  RobotBuilder robotBuilder;

public  RobotDirector(RobotBuilder robotBuilder){
    this.robotBuilder = robotBuilder;
}
public Robot create(){
    robotBuilder.buildRobotHead();
    robotBuilder.buildRobotTorso();
    return robotBuilder.getRobot();
}
}
