package Arrays;

import java.util.Arrays;

public class maxSlidingWindowOrMinimalArr {

    public static void main(String[] args) {

        minimalArr(new int[]{2,6,-1,2,4,1,-6,5}, 3);
        System.out.println("\n");
        minimalArr(new int[]{2,6,-1,2,4,1,-6,5}, 4);
        System.out.println("\n");
        minimalArr(new int[]{1,3,-1,-3,5}, 3);
    }

    public static void minimalArr(int[] arr, int k){

        for(int i=k; i<=arr.length; i++){
            int max=Integer.MIN_VALUE;

            for(int j=i-k; j<i; j++){
                max=Math.max(max, arr[j]);
            }
            System.out.print(max+" ");
        }

    }

}
