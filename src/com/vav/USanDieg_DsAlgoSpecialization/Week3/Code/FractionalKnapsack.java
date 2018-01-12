package com.vav.USanDieg_DsAlgoSpecialization.Week3.Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vaibhav on 1/11/18.
 */
public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        //First save the values and weights in an object and then sort it with the highest ratio of values/weights on top
        List<Item> items = new ArrayList<>();
        for(int i=0;i<values.length;i++){
            Item item = new Item(values[i],weights[i]);
            items.add(item);
        }
        Collections.reverse(items);
        double value = 0;
        int weightSum=0;
        int initialCapicity=0;
        for(int i=0;i<values.length;i++){
            if()
        }

        //write your code here

        return value;
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
