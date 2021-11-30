package medium;

import java.util.*;

public class Count1sInaSortedArr {

    public static void main(String[] args) {
        System.out.println("The 1s count is: "+count1s(new int[]{ 0, 0, 0 ,1,1,1, 1}));
        System.out.println("The 1s count is: "+count1s(new int[]{ 0, 0, 1,0,0,1,1, 1}));

        sep0s1s(new int[]{ 0, 0, 1,0,0,1,1, 0, 1});
        sep0s1s(new int[]{ 1, 0, 0, 1,0,0,1,1, 0, 1});
        sep0s1sUsingFreq(new int[]{ 1, 0, 3, 2, 0, 1,0,0,1,1, 0, 1, 2}, 4);
    }


    public static int count1s(int[] arr){
        int counter=0, i=0;
        while(i <arr.length){
            if(arr[i]==1){
                counter++;
            }
            i++;
        }
        return counter;
    }


    public static void sep0s1s(int[] arr){
        int j=0;
        int[] res= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                res[j++]=arr[i];
            }
        }

        for(int k=j; k<res.length; k++){
            res[j]=1;
            j++;
        }

        System.out.println("The resultant array is: "+Arrays.toString(res));

    }

    public static void Sep1s0s(int[] arr){
        int l=0, r=arr.length;

        while(l<r){
            if(arr[l]==1){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

                l++;
                r--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void sep0s1sUsingFreq(int[] arr, int num){
        int[] freq = new int[num];
        for(int val: arr){
            freq[val]++;
        }

        System.out.println("The freq array: "+ Arrays.toString(freq));

        int pointer=0;

        for(int i=0; i<freq.length; i++){
            while(freq[i] --> 0){
                arr[pointer]=i;
                pointer++;
            }
        }

        System.out.println("The array values final: "+Arrays.toString(arr));
    }

}
