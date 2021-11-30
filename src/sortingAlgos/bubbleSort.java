package sortingAlgos;

import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {
        bubblesrt(new int[]{120,15,30,5,75,40,100});
        bubblesrt(new int[]{120,-15,30,0,5,75,-40,100});
        bubblesrt(new int[]{-120,-15,-30,-5,-75,-40,100});

    }

    public static void bubblesrt(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }

}
