package medium;

import java.util.*;

public class Sort0s1s2s {

    public static void main(String[] args) {

        int[]a = {1,0,2,0,0,3,1,2,2,1,3,2};
//        sort(a);
//        for(int val : a)
//        {
//            System.out.print(val + " ");
//        }

        sortUsingFreqAndPointer(a);

    }
    /*Function to sort the given array*/
    public static void sort(int[]a) {
        /* array to keep the count of 0s, 1s, 2s*/
        int[] freq = new int[4];

        /* traverse the given array for filling the
         * frequency array*/
        for (int val : a) {
            freq[val]++;
            System.out.println("The inside the freq arr: "+Arrays.toString(freq));
        }
        System.out.println("The freq arr: "+Arrays.toString(freq));

        /*pointer to traverse the given array again*/
        int pointer = 0;
        for (int i = 0; i < freq.length; i++) {
            /* loop to exhaust the number of 0s, 1s, 2s*/
            while (freq[i] --> 0) {
                /*at the current pointer plot the current number*/
                a[pointer] = i;
                /*increment the pointer*/
                pointer++;
            }
        }
    }




    public static void sortUsingFreqAndPointer(int[] arr){
        int[] freq=new int[4];

        for(int val: arr){
            freq[val]++;
        }
        System.out.println("The freq array is: "+ Arrays.toString(freq));

        int pointer=0;
        for(int i=0; i<freq.length; i++){
            while(freq[i]-->0){
                arr[pointer]=i;
                pointer++;
            }
        }
        System.out.println("The sorted array: "+Arrays.toString(arr));

    }


    public static void sortUsingBruteForce(int[] arr){
        int[] resArr=new int[arr.length];


    }


}
