package medium;

import java.util.*;

public class nextPermutation {

    public static void main(String[] args) {
        nxtPermutation(new int[]{1,2,3});
        nxtPermutation(new int[]{3,2,1});
        nxtPermutation(new int[]{1,1,5});
    }

    public static void nxtPermutation(int[] nums){


        int i=nums.length-2;

        while(i>=0 && nums[i+1]<= nums[i]){
            i--;
        }

        if(i>=0){
            int j=nums.length-1;

            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1);

        System.out.println(Arrays.toString(nums));

    }

    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void reverse(int[] nums, int start){
        int i=start, j=nums.length-1;

        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }


}
