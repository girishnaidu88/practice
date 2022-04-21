package google;

import java.util.*;

public class InsertionSort {

    //Complexity:
    // Time: O(n2) - But it is faster than Select/Bubble sort because of less comparision.
    //Space: O(1)

    public static void main(String[] args) {
        int[] nums={2,0,4,7,1,5,3};
        sortInsertion(nums);
    }

    public static void sortInsertion(int[] nums){


        System.out.println(Arrays.toString(nums));
        long startTime=System.currentTimeMillis();
        for(int i=1; i<nums.length; i++){
            int value=nums[i];
            int iVal=i;

            while(iVal > 0 && (nums[iVal-1]>value)){
                nums[iVal]=nums[iVal-1];
                iVal--;
            }

            nums[iVal]=value;

        }
        long endTime=System.currentTimeMillis();
        long timeTaken=endTime-startTime;
        System.out.println("Time taken: "+(timeTaken));

        System.out.println(Arrays.toString(nums));


    }

}
