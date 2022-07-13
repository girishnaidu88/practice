package top75;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        twoSumIter(new int[]{2,13,24,1,2,3,4,5,6,7,8,5,-11, -12, -13, -8, -2}, 10);
        twoSum2PassHash(new int[]{2,13,24,1,2,3,4,5,6,7,8,5,-11, -12, -13, -8, -2}, 10);
        twoSum1PassHash(new int[]{2,13,24,1,2,3,4,5,6,7,8,5,-11, -12, -13, -8, -2}, 10);
    }

    // Time: O(n2) & Space O(1)
    public static void twoSumIter(int[] nums, int target){
        System.out.println("The values matching are: ");
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(Math.abs(nums[i]+nums[j])==target){
                    System.out.println(nums[i] +","+nums[j]);
                }
            }
        }
    }

    // Time: O(n) & Space O(n)
    public static void twoSum2PassHash(int[] nums, int target){
        Map<Integer, Integer> resultMap= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!resultMap.containsKey(nums[i])){
                resultMap.put(nums[i], i);
            }
        }

        System.out.println("The matched entries are: ");
        for(int i=0; i<nums.length; i++){
            int compliment=target-nums[i];
            if(resultMap.containsKey(Math.abs(compliment)) && resultMap.get(Math.abs(compliment)) != i){
                System.out.println(nums[i]+" , "+ compliment);
            }
        }
    }

    // Time: O(n) & Space O(n)
    public static void twoSum1PassHash(int[] nums, int target){
        System.out.println("The entires matched are: ");
        Map<Integer, Integer> resultMap= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int compliment=target-Math.abs(nums[i]);
            if(resultMap.containsKey(Math.abs(compliment))){
                System.out.println(nums[i] +" , "+Math.abs(compliment));
            }

            resultMap.put(nums[i], i);
        }
    }


}
