package medium;


import java.util.*;

public class mergeIntervals {

    public static void main(String[] args) {
       int[][] res= mergeInt(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for(int[] r: res){
            System.out.print(Arrays.toString(r));
        }

        System.out.println();
       int[][] res1= mergeInt(new int[][]{{-6,4},{1,3},{2,6},{5,10},{9,-18}});
       for(int[] r: res1){
           System.out.print(Arrays.toString(r));
       }
    }


    public static int[][] mergeInt(int[][] intervals){

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged=new LinkedList<>();

        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1]=Math.max(merged.getLast()[1], interval[1]);
            }
        }


        return merged.toArray(new int[merged.size()][]);

    }
}
