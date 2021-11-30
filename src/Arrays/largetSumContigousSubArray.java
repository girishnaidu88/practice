package Arrays;

import java.util.*;

public class largetSumContigousSubArray {
    public static void main(String[] args) {
        largestsumContiniousSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        maxsumContiniousSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public static void largestsumContiniousSubArray(int[] arr){
        int maxEndHere=arr[0], maxSoFar=arr[0];

        for(int i=1; i<arr.length;i++){
            maxEndHere=Math.max(maxEndHere, arr[i]+maxEndHere);
            maxSoFar=Math.max(maxSoFar, maxEndHere);
        }
        System.out.println("The max is: "+maxSoFar);
    }

    public static void maxsumContiniousSubArray(int[] arr){
        int[] result=new int[arr.length];
        result[0]=arr[0];

        for(int i=1; i<arr.length; i++){
            result[i]=Math.max(result[i-1]+arr[i], arr[i]);
        }

        System.out.println("the result array: "+Arrays.toString(result));
        int maxSumarray=result[0];
        for(int j=1; j<result.length;j++){
            if(maxSumarray < result[j]){
                maxSumarray=result[j];
            }
        }

        System.out.println(maxSumarray);
    }



}
