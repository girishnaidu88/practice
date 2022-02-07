package medium;

import java.util.*;

public class mergeSortedArraysNew {

    public static void main(String[] args) {

        int[] nums1={2,4,6}; int[] nums2={1,3,5};
        int m=nums1.length, n=nums2.length;

        merger(nums1, 3, nums2, 3);
    }

    public static void merger(int[] nums1, int m, int[] nums2, int n){
        int tail1=m-1, tail2=n-1, finished=m+n-1;
        int[] nums3=new int[finished];
        while(tail1 >= 0 && tail2 >=0){
            nums3[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        while(tail2>=0){
            nums3[finished--]=nums2[tail2--];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
