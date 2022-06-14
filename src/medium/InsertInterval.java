package medium;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        print2D(insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));
        print2D(insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));

    }

    public static void print2D(int[][] res){
        for(int i=0; i< res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();

        int[] segment = newInterval;

        for(int[] current:intervals){
            if(segment[1] < current[0]){
                temp.add(segment);
                segment = current;
            }else if(current[1] < segment[0]){
                temp.add(current);
            }else{
                segment[0] = Math.min(segment[0], current[0]);
                segment[1] = Math.max(segment[1], current[1]);
            }
        }

        temp.add(segment);

        int[][] result = new int[temp.size()][2];
        temp.toArray(result);
        return result;
    }

}
