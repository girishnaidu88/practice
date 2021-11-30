package sortingAlgos;

import java.util.*;

public class insertionSortAlgo {
    public static void main(String[] args) {
        insertionSort(new int[]{100,20,15,30,5,75});
        insertionSort(new int[]{120,-15,30,0,5,75,-40,100});
        insertionSort(new int[]{-120,-15,-30,-5,-75,-40,100});
    }

    public static void insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int valueToSort=arr[i];
            int j;
             for(j=i; j>0 && arr[j-1]>valueToSort; j--){
                 arr[j]=arr[j-1];
             }
             arr[j]=valueToSort;
        }

        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}
