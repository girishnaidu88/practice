package medium;

import java.util.*;

public class largetSumContigousSubArray {
    public static void main(String[] args) {
        largestsumContiniousSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        maxsumContiniousSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public static void largestsumContiniousSubArray(int[] arr){
        int maxEndHere=arr[0], maxSoFar=arr[0];

        for(int i=0; i<arr.length;i++){
            maxEndHere=Math.max(maxEndHere, arr[i]+maxEndHere);
            maxSoFar=Math.max(maxSoFar, maxEndHere);
        }
        System.out.println("The max is: "+maxSoFar);
    }

    public static void maxsumContiniousSubArray(int[] arr){

        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        System.out.println(max_so_far);
    }



}
