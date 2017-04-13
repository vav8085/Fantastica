package com.vav.Common.Sorting;

/**
 * Created by Vaibhav on 4/9/2017.
 */
public class Partitioning {
    static int arr[] = {4,3,2,1};
    public static void main(String arg[]){
       // mergeSort.mergeSort(arr);

        int partition = partitionIt(0,arr.length-1,arr.length/2);
        System.out.println("Partition:"+partition);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }

    }

    private static int partitionIt(int start, int end, int partition) {
        int left = start-1;
        int right = end+1;
        while (true) {
            while (left < right && arr[++left] < arr[partition]) ;
            while (right > left && arr[--right] > arr[partition]) ;
            if(left>=right){
                break;
            }else{
                swap(left,right);
            }
        }


        return arr[partition];
    }

    private static void swap(int one, int two) {
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }

}
