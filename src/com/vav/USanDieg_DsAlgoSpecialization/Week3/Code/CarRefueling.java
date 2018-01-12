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

        System.out.print(optimalRefuels(maxTravel,arr));

    }
    //this is not printing correct for 120,350,500,750,900,1000, need to check
    private static String optimalRefuels(int maxTravel, GasStation[] arr) {
        String s="";
        //ToDo write logic
        GasStation current=arr[0];
        GasStation previous = new GasStation(0,"G0");
        s = s+previous.getValue();
        for(int i=0;i<=arr.length;i++){
            while(i<arr.length && (previous.getDistance()+maxTravel)>=arr[i].getDistance()){
                current=arr[i];
                i++;
            }
            previous=current;
            s=s+current.getValue();
        }
        return s;
    }

}
 class GasStation{
    private int distance;
    private String value;

    public GasStation(int distance, String value){
        this.value = value;
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
