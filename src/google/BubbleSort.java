package google;

import java.util.*;

public class BubbleSort {

    //Complexity:
    //Time: O(n2)
    //Space: O(1)

    public static void main(String[] args) {
        int[] nums={2,0,4,7,1,5,3};
        sortBubble(nums);
    }

    public static void sortBubble(int[] nums){

        long startTime=System.currentTimeMillis();
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        long endTime=System.currentTimeMillis();
        long timeTaken=endTime-startTime;
        System.out.println("Time taken: "+(timeTaken));

        System.out.println(Arrays.toString(nums));
    }

}
