package sortingAlgos;

import java.util.*;

public class selectionSortAlgo {

    public static void main(String[] args) {
        selectionSort(new int[]{100,20,15,30,5,75});
        selectionSort(new int[]{120,-15,30,0,5,75,-40,100});
        selectionSort(new int[]{-120,-15,-30,-5,-75,-40,100});
    }

    public static void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int index=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index=j;
                }

                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }

        System.out.println("The final sorted array: "+Arrays.toString(arr));
    }
}
