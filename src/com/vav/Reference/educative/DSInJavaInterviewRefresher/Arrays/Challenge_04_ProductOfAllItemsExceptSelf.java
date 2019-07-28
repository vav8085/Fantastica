package com.vav.Reference.educative.DSInJavaInterviewRefresher.Arrays;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Challenge_04_ProductOfAllItemsExceptSelf {
    /**
     * brute force
     * @param input
     * @return
     */
    public static int[] productOfAllExceptSelf(int[] input){
        int[] output = new int[input.length];

        for(int i=0;i<output.length;i++){
            output[i] = 1;
        }
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                if(j!=i)
                    output[i] = output[i] * input[j];
            }
        }
        return output;
    }

    /**
     * Optimized
     * @param input
     * @return
     */
    public static int[] productOfAllExceptSelfOn(int[] input){
        int[] output = new int[input.length];
        //First we will take the product of all the items to the left of the value
        //for this we will keep a temp variabl to store the product of current value * temp value
        // every time temp value which contain the previous product will be saved in output and a new temp will be calculated
        int temp = 1;
        for(int i=0;i<input.length;i++){
            output[i] = 1;
        }
        for(int j=0;j<input.length;j++){
            output[j] = temp; //1,5,
            temp = input[j]*temp;
        }
        //reset temp to 1
        temp = 1;
        for(int k=input.length-1;k>=0;k--){
            output[k] = temp * output[k];
            temp = input[k] * temp;
        }
        return output;
    }
    public static void main(String arg[]){
        int[] arr = {5,10,20,30,40};
        int[] result = productOfAllExceptSelfOn(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
