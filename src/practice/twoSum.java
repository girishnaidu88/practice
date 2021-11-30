package practice;

import java.util.*;

public class twoSum {

    public static void main(String[] args){
        int[] a={2, 1, 4, 5, 7, 3};
        System.out.println("The array elements the adds up to make the sum is: "+ sumTwo(a, 10));
    }

    public static String sumTwo(int[] nums, int target){
        if(nums ==null | nums.length ==0){
            return "Empty array";
        }

        int i=0;
        int j=nums.length-1;

        while(i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                ++i;
            } else if (sum > target) {
                j--;
            } else {
                return Arrays.toString(new int[]{i , j });
            }
        }

        return null;
    }
}
