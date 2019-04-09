package com.vav.CoursesBooks.iCamp.ArraysAndStrings_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LargestSubarraySum {

    /**
     * To solve this problem we will take two numbers
     * sumTillNow and maximumSum
     * We will parse through the array and
     * if   a number > 0
     * is parsed we will add it to sumTillNow
     * We will check if maximumSum is less than sumTillNow then we will make sumTillNow as maximumSum
     * else
     * we will reset sumTillNow to 0
     *
     * @param input
     * @return
     */
    public static int largestSubarraySum(int[] input) {
        int sumTillNow = 0;
        int maximumSum = 0;
        for (int i = 0; i < input.length; i++) {
            sumTillNow = sumTillNow + input[i];
            if (sumTillNow < 0) {
                sumTillNow = 0;
            }
            if (maximumSum < sumTillNow) {
                maximumSum = sumTillNow;
            }
        }
        return maximumSum;
    }

    /**
     * This is another way of solving the same problem
     * We always consider that 0 is the largest number.
     *
     * The principle is that maximum sum at an index i is the maximum of 0 and maximum at i-1 + a[i]
     * We parse through the array and make a separate array holding the maximum sum at each index.
     *
     * We then parse through this new array and find the maximum sum
     *
     * @param input
     * @return
     */
    public static int largestSubarraySum2Arrays(int[] input) {
        int[] output = new int[input.length];
        output[0] = Math.max(0, input[0]);
        int max = 0;
        for (int i = 1; i < input.length; i++) {
            output[i] = Math.max(0, output[i - 1] + input[i]);
        }
        for (int j = 0; j < output.length; j++) {
            if (output[j] > max) {
                max = output[j];
            }
        }
        return max;
    }
    /**
     * In this problem we need to find the numbers in an array that sum to a number
     *
     * The way we will approach this problem is by taking two pointers
     * We will initialize two pointers at the beginning of the array
     * We will also have a variable called currentSum
     * if(currentSum<number) increase the front pointer
     * else move the rear pointer
     *
     * At any point when currentSum==number return the array
     *
     * @param input
     * @return
     */
    public static int[] sumToANumberPositiveInput(int number, int[] input){
        int[] output = new int[input.length];
        int currentSum=0;
        for(int i=0,j=0;i<input.length && j< input.length;){
            if(currentSum < number){
                currentSum = currentSum + input[i];
                i++;
            }else if(currentSum > number){
                currentSum = currentSum - input[j];
                j++;
            }else{
                System.out.print(j + " " + i);
                break;
            }
        }
        return output;
    }

    public static List<Integer> sumToZero(int value, int[] input){
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i< input.length;i++){
            sum = sum + input[i];
            if(sum==0){
                output.add(0);
                output.add(i);
                return output;
            }
            if(map.containsKey(sum)){
                output.add(map.get(sum)+1);
                output.add(i);
                return output;
            }
            map.put(sum,i);
        }
        return new ArrayList<>();
    }

    public static List<Integer> sumToValue(int value, int[] input){
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i< input.length;i++){
            sum = sum + input[i];
            if(sum-value==0){
                output.add(0);
                output.add(i);
                return output;
            }
            if(map.containsKey(sum-value)){
                output.add(map.get(sum-value)+1);
                output.add(i);
                return output;
            }
            map.put(sum,i);
        }
        return new ArrayList<>();
    }


    public static void main(String arg[]) {
        //Longest substring sum
        int[] arr = {-3, -2, 4, -3, 5, -2};
        System.out.println(largestSubarraySum2Arrays(arr));

        //Sum to a number
        int[] brr = {5,2,3,7,1,4,9,6};
        int number = 11;
        sumToANumberPositiveInput(number,brr);
        System.out.println();

        //Sum to zero
        int[] crr = {-2,-3,4,-1,7,-1};
        List<Integer> results = sumToZero(0,crr);
        for(Integer result : results){
            System.out.print(result + ", ");
        }
    }
}
