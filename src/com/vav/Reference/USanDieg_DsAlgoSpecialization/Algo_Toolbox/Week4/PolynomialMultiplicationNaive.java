package com.vav.Reference.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week4;

/**
 * Created by Vaibhav on 2/23/18.
 */
public class PolynomialMultiplicationNaive {

    public static void main(String arg[]){
        int[] s = multiplyPolynomialNaive(new int[]{1,10},new int[]{4,2});
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public static int[] multiplyPolynomialNaive(int[] a, int[] b){
        int[] result = new int[a.length +b.length-1];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                result[i+j] = result[i+j] + a[i]*b[j];
            }
        }
        return result;
    }
}
