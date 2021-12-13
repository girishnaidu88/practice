package medium;

import java.util.*;

public class subsets {

    public static void main(String[] args){
        int[] nums=new int[]{1,3,2};


//        subsets ss=new subsets();
        System.out.println(subset(new int[]{1,3,2}));
    }

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> results= new ArrayList<>();

        if(nums==null || nums.length==0){
            return results;
        }

//        Arrays.sort(nums);
        List<Integer> subset=new ArrayList<>();
        toFindAllSubsets(nums, results, subset, 0);

        return results;

    }

    private static void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex){

        results.add(new ArrayList<>(subset));

        for(int i=startIndex; i<nums.length; i++){
            subset.add(nums[i]);
            toFindAllSubsets(nums, results, subset, i+1);
            subset.remove(subset.size()-1);
        }

    }
}
