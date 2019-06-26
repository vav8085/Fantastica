package com.vav.Algorithms.Common.Hashing;

/**
 * Created by vaibhav on 1/2/18.
 */
public class SeparateChainingTest {
    public static void main(String arg[]){
        SeparateChaining separateChaining = new SeparateChaining(10);
        separateChaining.insert(1);
        separateChaining.insert(11);
        separateChaining.insert(2);
        separateChaining.insert(12);
        separateChaining.insert(3);
        separateChaining.insert(4);
        separateChaining.insert(5);
        separateChaining.insert(15);
        separateChaining.insert(7);
        separateChaining.insert(9);

        System.out.println(separateChaining.find(15)?"found":"notfound");
        separateChaining.delete(15);
        System.out.println(separateChaining.find(15)?"found":"notfound");
        separateChaining.delete(5);
        System.out.println(separateChaining.find(5)?"found":"notfound");



    }
}
