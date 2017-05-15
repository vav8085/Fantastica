package com.vav.CTCI.Chapter1;

/**
 * Created by Vaibhav on 5/15/17.
 */
public class Q6_RotateImage90 {

    public static void rotateMatrix(int[][] matrix, int n){
        int numberOfCycles = n/2;
        for(int layer=0;layer<numberOfCycles;layer++){
            int first = layer, last = n-1-layer;
            for(int i=first;i<last;i++){
                //An offset to
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[first+offset][last];
                matrix[first+offset][last] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[last-offset][first];
                matrix[last-offset][first] = top;
            }
        }
    }
    public static void main(String arg[]){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i = 0 ;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        rotateMatrix(arr,4);
        for(int i = 0 ;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
