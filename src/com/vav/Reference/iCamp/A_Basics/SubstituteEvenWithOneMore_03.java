package com.vav.Reference.iCamp.A_Basics;

public class SubstituteEvenWithOneMore_03 {
    public static void main(String arg[]){
         int[] arr = {2,1,3,6,8,-1,-1,-1};
         int[] result = substituteEvenWithOneMore(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        }

    /**
     * The way to approach this problem is by traversing it linearly and whenever we find an even integer then create
     * another array of size+1 and move all the elements of current array to new array inserting one more of this even number
     * @param input
     * @return
     */
    public static int[] substituteEvenWithOneMore(int[] input){
        int lastValue = getLastValue(input);
        for(int i=input.length-1;i>=0&&lastValue>=0;--i){
            if(input[lastValue] % 2 == 0){
                input[i] = input[lastValue];
                --i;
                input[i] = input[lastValue];
            }else{
                input[i] = input[lastValue];
            }
            --lastValue;
        }
        return input;
    }

    private static int getLastValue(int[] input) {
        for(int i=input.length-1;i>=0;i--){
            if(input[i]!=-1){
                return i;
            }
        }
        return 0;
    }
}
