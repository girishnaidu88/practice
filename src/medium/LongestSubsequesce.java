package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubsequesce {
    public static void main(String[] args) {
        System.out.println("Sorting: "+longestSubsequenceArrSort(new int[]{100,4,200,1,3,2}));
        System.out.println("Hashset: "+longestSubsequenceHashSet(new int[]{100,4,200,1,3,2}));
        System.out.println("Sorting: "+longestSubsequenceArrSort(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println("Hashset: "+longestSubsequenceHashSet(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println("Sorting: "+longestSubsequenceArrSort(new int[]{0, 1, 3}));
        System.out.println("Hashset: "+longestSubsequenceHashSet(new int[]{0, 1, 3}));
        System.out.println("Sorting: "+longestSubsequenceArrSort(new int[]{}));
        System.out.println("Hashset: "+longestSubsequenceHashSet(new int[]{}));
    }

    public static int longestSubsequenceArrSort(int[] numbers){
        if(numbers.length==0){
            return 0;
        }
        Arrays.sort(numbers); //O(n log n)

        int longestStreak=1;
        int currentStreak=1;

        for(int i=1; i<numbers.length; i++){
            if(numbers[i] != numbers[i-1]){
                if(numbers[i] == numbers[i-1]+1){
                    currentStreak += 1;
                }else{
                    longestStreak = Math.max(currentStreak, longestStreak);
                    currentStreak=1;
                }
            }
        }
        return Math.max(longestStreak, currentStreak);
    }


    // Using HashSet   Time: O(n)

    public static int longestSubsequenceHashSet(int[] numbers){
        Set<Integer> numSet = new HashSet<>();
        for(int i: numbers){
            numSet.add(i);
        }

        int longestStreak=0;

        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak=1;

                while(numSet.contains(currentNum+1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }


}
