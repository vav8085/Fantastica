package com.vav.Archive.CTCI.Archive.work_2017.Chapter3;

/**
 * Created by Vaibhav on 5/16/17.
 */
public class Q1_ThreeStacksOneArray {
    int start1, start2, start3, top1, top2, top3;
    int[] arr;

    public static void main(String arg[]) {
        Q1_ThreeStacksOneArray stacks = new Q1_ThreeStacksOneArray(6);
        stacks.push(1,1);
        stacks.push(1,2);
        stacks.push(2,10);
        stacks.push(2,20);
        stacks.push(3,100);
        stacks.push(3,200);
        System.out.println(stacks.pop(1));
        System.out.println(stacks.pop(3));
    }

    public Q1_ThreeStacksOneArray(int size) {
        arr = new int[size];
        start1 = size / 3 -1;
        start2 = size/ 3 + size / 3 -1;
        start3 = size /3 +size/3+size/3 -1;
        top1 = -1;
        top2 = start1;
        top3 = start2;
    }

    public void push(int stackNumber, int value) {
        if (stackNumber == 1) {
            if(top1<start1)
            arr[++top1] = value;
            else System.out.println("Stack 1 full!");
        } else if (stackNumber == 2) {
            if(top2<start2)
                arr[++top2] = value;
            else System.out.println("Stack 2 full!");
        } else if (stackNumber == 3) {
            if(top3<start3)
                arr[++top3] = value;
            else System.out.println("Stack 3 full!");
        } else {
            System.out.println("Maximum stacks = 3, please retry!");
        }
    }
    public int pop(int stackNumber) {
        if (stackNumber == 1) {
            if(top1>-1){
                return arr[top1--];
            }
            else System.out.println("Stack 1 already empty!");
        } else if (stackNumber == 2) {
            if(top2>start2-1) {
                return arr[top2--];
            }
            else System.out.println("Stack 2 already empty!");
        } else if (stackNumber == 3) {
            if(top3>start3-1) {
                return arr[top3--];
            }
            else System.out.println("Stack 3 already empty!");
        } else {
            System.out.println("Maximum stacks = 3, please retry!");
        }
        return 99999;

    }

}
