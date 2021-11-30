package sortingAlgos;

import java.util.*;

public class mergeSortAlgo {



    static  int  arr[]={100,20,15,30,5,75,40};
    static  int  arr1[]={-120,-15,-30,-5,-75,-40,100};

    public static void main(String args[])
    {
        // Print array before merge sort
        System.out.println("Array After sorting:"+Arrays.toString(arr));

        mergeSort(0,arr.length-1);

        // Print array after sorting
        System.out.println("Array After sorting:"+Arrays.toString(arr));
    }


    public static void mergeSort(int start, int end){
        int mid=(start+end)/2;
        if(start<end){
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            merge(start, mid, end);
        }
    }

    public static void merge(int start, int mid, int end){
        int[] tempArr=new int[arr.length];
        int tempIndex=start;

        int startIndex=start;
        int midIndex=mid+1;

        while(startIndex<=mid && midIndex <=end){
            if(arr[startIndex]<arr[midIndex]){
                tempArr[tempIndex++]=arr[startIndex++];
            }else{
                tempArr[tempIndex++]=arr[midIndex++];
            }
        }

        while(startIndex<=mid){
            tempArr[tempIndex++]=arr[startIndex++];
        }

        while(midIndex<= end){
            tempArr[tempIndex++]=arr[midIndex++];
        }

        for(int i=start; i<=end; i++){
            arr[i]=tempArr[i];
        }

    }





   /* // Recursive algorithm for merge sort
    public static void mergeSort(int start,int end)
    {
        int mid=(start+end)/2;
        if(start<end)
        {
            // Sort left half
            mergeSort(start,mid);
            // Sort right half
            mergeSort(mid+1,end);
            // Merge left and right half
            merge(start,mid,end);
        }
    }

    private static void merge(int start, int mid, int end) {
        // Initializing temp array and index
        int[] tempArray=new int[arr.length];
        int tempArrayIndex=start;

        int startIndex=start;
        int midIndex=mid+1;

        // It will iterate until smaller list reaches to the end
        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                tempArray[tempArrayIndex++]=arr[startIndex++];
            }
            else
            {
                tempArray[tempArrayIndex++]=arr[midIndex++];
            }
        }

        // Copy remaining elements
        while(startIndex<=mid)
        {
            tempArray[tempArrayIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            tempArray[tempArrayIndex++]=arr[midIndex++];
        }

        // Copy tempArray to actual array after sorting
        for (int i = start; i <=end; i++) {
            arr[i]=tempArray[i];
        }
    }

    */


}
