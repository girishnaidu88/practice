package medium;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {

        int[] outPut1=solve(new int[]{4,5,6,5,4,3});
        System.out.println(Arrays.toString(outPut1));

        outPut1=solve(new int[]{8,5,5,5,5,1,1,1,4,4});
        System.out.println(Arrays.toString(outPut1));
    }

    public static int[] solve(int[] nums) {

        //Put all the numbers into map to find the no.of occurances.
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);


        //Find the min values using priority Queue
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b)-> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : a.getValue() - b.getValue());
        minHeap.addAll(map.entrySet());


        int cur = 0;
        while(!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> e = minHeap.poll();
            for(int i=0;i<e.getValue();i++) {
                nums[cur++] = e.getKey();
            }
        }

        return nums;
    }
}
