package com.vav.USanDieg_DsAlgoSpecialization.Week3.Code;

/**
 * Created by Vaibhav on 1/11/18.
 */
public class CarRefueling {

    public static void main(String arg[]){
        GasStation[] arr = new GasStation[6];
        int maxTravel = 400;
        arr[0] = new GasStation(120,"G1");
        arr[1] = new GasStation(350,"G2");
        arr[2] = new GasStation(500,"G3");
        arr[3] = new GasStation(700,"G4");
        arr[4] = new GasStation(900,"G5");
        arr[5] = new GasStation(1000,"G6");

        String s = optimalRefuels(maxTravel,arr);
    }

    private static String optimalRefuels(int maxTravel, GasStation[] arr) {
        StringBuilder sb = new StringBuilder();
        //ToDo write logic

        return sb.toString();
    }

}
 class GasStation{
    private int distance;
    private String name;

    public GasStation(int distance, String name){
        this.name = name;
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
