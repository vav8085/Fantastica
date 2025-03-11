package com.vav.Archive.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week3.Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vaibhav on 1/11/18.
 */
public class FractionalKnapsack {

    public static void main(String arg[]){
        int capacity = 10;
        int[] values={500};
        int[] weights={30};
        System.out.print(getOptimalValue(capacity,values,weights));
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        //First save the values and weights in an object and then sort it with the highest ratio of values/weights on top
        List<Item> items = new ArrayList<>();
        for(int i=0;i<values.length;i++){
            Item item = new Item(values[i],weights[i]);
            items.add(item);
        }
        Collections.sort(items);
        double value = 0;
        double availableSpace=capacity;
        for(int i=values.length-1;i>=0;i--){
            if(availableSpace>=0 && (availableSpace-items.get(i).getWeight()>=0)){
                availableSpace = availableSpace-items.get(i).getWeight();
                value=value+items.get(i).getValue();
            }else{
                if(availableSpace>0) {
                    double weightPossibleToCarry = items.get(i).getWeight() / availableSpace;
                    value = value + items.get(i).getValue() / weightPossibleToCarry;
                }
            }
        }
        return Math.round(value*1000.00)/1000.00;
    }
}
class Item implements Comparable<Item>{
    private int value;
    private int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(this.value/this.weight, o.value/o.weight);
    }
}
