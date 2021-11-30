package medium;

import java.util.*;

public class sortColors {

    public static void main(String[] args) {
        colorSort(new int[]{0,1,0,2,3,0,2,3,1});
    }

    public static void colorSort(int[] arr){
        int[] freq=new int[4];

        for(int val: arr){
            freq[val]++;
        }

        int pointer=0;
        for(int i=0; i<freq.length;i++){
            while(freq[i]-->0){
                arr[pointer]=i;
                pointer++;
            }
        }
        System.out.println("The sorted colors array: "+Arrays.toString(arr));
    }

}
