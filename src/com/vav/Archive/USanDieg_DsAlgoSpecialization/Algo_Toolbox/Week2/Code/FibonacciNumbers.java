package com.vav.Archive.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week2.Code;

/**
 * Created by vaibhav on 1/6/18.
 */
public class FibonacciNumbers {
    public static void main(String arg[]){
            System.out.print(fibonacciNumbers(6));

    }

    /**
     * The problem with this algorithm is that because of recursion we are repeating the number of times we are calling
     * F(n). If n=5 then we are calling:
     * F(4) + F(3)
     * F(3) + F(2)   +   F(2) + F(1)
     * F(2) + F(1) + F(1) + F(0) + F(1) + F(0) + 1
     * So there is so much repetition and complexity of this algorithm goes exponential.
     * @param num
     * @return
     */
    private static int printFibonacciRecursive(int num) {
        if(num==0){
            return 0;
        }
         if(num==1) {
             return 1;
         }
            return printFibonacciRecursive(num-1) + printFibonacciRecursive(num-2);
    }
    public static void printFibonacciIterative(int num){
          int previousFibo = 0; //when its second fibonacci(0,1,2) then previous 0
          int newFibo = 1;  //and current fibonacci will be 1
          for(int i=0;i<=num;i++){
              if(i==0){   //0th fibo
                  System.out.println(0);
              }else if(i==1){ // first fibo
                  System.out.println(1);
              }else { //second fibo and onwards
                  int temp = newFibo;
                  newFibo = previousFibo + newFibo;
                  previousFibo = temp;
                  System.out.println(newFibo);
              }
          }
      }
      public static int fibonacciNumbers(int num){
        int[] arr = new int[num+1];
        arr[0]=0;
        if(arr.length>1)
        arr[1]=1;
          int i=2;
        for (;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[arr.length-1];
      }
}
