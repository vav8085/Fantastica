package com.vav.Design.ReactiveProgramming.Code.FunctionalInterfaces;

public class Client{
   public static void main(String arg[]){
       Vehicle vehicle = speed -> System.out.println("Speed is "+speed);
       vehicle.accelerate(50);
       vehicle.fly();
   }
}
