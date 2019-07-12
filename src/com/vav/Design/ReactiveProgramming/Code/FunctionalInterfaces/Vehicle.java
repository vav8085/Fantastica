package com.vav.Design.ReactiveProgramming.Code.FunctionalInterfaces;

public interface Vehicle {
    void accelerate(int speed);
    default void fly(){
        System.out.println("Flying!");
    }
}
