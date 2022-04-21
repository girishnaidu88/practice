package google;

import java.util.*;

public class detectSquares {


    public static void main(String[] args) {
        /*Complexity

        Time:
        add: O(1)
        count: O(T), where T <= 5000 is total number of points after calling add.
        Space: O(T) in Python, O(1000^2) in C++/Java
        */

    }

    int[][] cntpoints=new int[1001][1001];
    List<int[]> points=new ArrayList<>();


    public void add(int[] point){
        cntpoints[point[0]][point[1]] += 1;
        points.add(point);
    }

    public int count(int[] point){
        int x1=point[0], y1=point[1], ans=0;

        for(int[] p3: points){
            int x3=p3[0], y3=p3[1];
            if(Math.abs(x1-x3)==0 || Math.abs(x1-x3) != Math.abs(y1-y3)){
                continue;
            }
            ans += cntpoints[x3][y1]*cntpoints[x1][y3];
        }

        return ans;
    }
}
