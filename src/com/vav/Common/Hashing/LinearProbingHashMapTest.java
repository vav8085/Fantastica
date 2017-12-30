package com.vav.Common.Hashing;

/**
 * Created by vaibhav on 12/30/17.
 */
public class LinearProbingHashMapTest {
    public static void main(String arg[]){
        //Suppose we know that we have 10 employees maximum but their employee numbers are random starting 10000-20000
        //We cannot just create an array of 20000 records to save these so we create a hashmap of size 23 and save them there
        LinearProbingHashMap linearProbingHashMap = new LinearProbingHashMap(23);
        Data data1 = new Data(10000);
        Data data2= new Data(10001);
        Data data3 = new Data(10002);
        Data data4 = new Data(10023);
        Data data5 = new Data(10004);
        Data data6 = new Data(10529);
        Data data7 = new Data(10006);
        Data data8 = new Data(19999);
        Data data9 = new Data(10345);
        Data data10 = new Data(10487);

        linearProbingHashMap.insert(data1);
        linearProbingHashMap.insert(data2);
        linearProbingHashMap.insert(data3);
        linearProbingHashMap.insert(data4);
        linearProbingHashMap.insert(data5);
        linearProbingHashMap.insert(data6);
        linearProbingHashMap.insert(data7);
        linearProbingHashMap.insert(data8);
        linearProbingHashMap.insert(data9);
        linearProbingHashMap.insert(data10);

        System.out.println(linearProbingHashMap.find(12345));
        System.out.println(linearProbingHashMap.find(10006));
        System.out.println(linearProbingHashMap.find(10487));
        linearProbingHashMap.delete(10006);
        System.out.println(linearProbingHashMap.find(10006));
        System.out.println(linearProbingHashMap.find(19999));

    }
}
