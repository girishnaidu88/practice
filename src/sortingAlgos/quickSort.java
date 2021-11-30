package sortingAlgos;

import java.util.*;

public class quickSort {
        static int[] arr=new int[]{-1,-120,-15,-30,-5,-75,-40,100};
    public static void main(String[] args) {
        System.out.println("The array before sort: "+Arrays.toString(arr));
        sort(arr);
        System.out.println("The array after sort: "+Arrays.toString(arr));
//        sort(new int[]{120,-15,30,0,5,75,-40,100});
//        sort(new int[]{-120,-15,-30,-5,-75,-40,100});
    }

    public static void sort(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }

        quickSort(0, arr.length-1);
    }

    public static void quickSort(int l, int r){
        int i=l;
        int j=r;

        int pivot=arr[l+(r-l)/2];

        while(i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
//                excahge(i, j);
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            if(l < j){
              quickSort(l, j);
            }

            if(i < r){
                quickSort(i, r);
            }

        }
    }

    public static void excahge(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
