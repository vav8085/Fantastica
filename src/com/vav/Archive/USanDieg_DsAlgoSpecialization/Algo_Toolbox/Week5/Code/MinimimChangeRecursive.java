package com.vav.Archive.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week5.Code;

/**
 * Created by Vaibhav on 3/5/18.
 */
public class MinimimChangeRecursive {

    public static void main(String arg[]) {
        int[] arr = {10,4,1};
        int value = 64;
        System.out.println(recursiveMinimumChange(value,arr));

    }
    public static int recursiveMinimumChange(int money, int[] coins){
        if(money==0)
            return 0;
        int minCoinCount = Integer.MAX_VALUE;
        for(int i=0 ;i<coins.length;i++){
            if(money>=coins[i]){
                int coinCount = recursiveMinimumChange(money - coins[i], coins);
                if((coinCount+1) < minCoinCount){
                    minCoinCount = coinCount+1;
                }
            }
        }
        return minCoinCount;
    }
}
