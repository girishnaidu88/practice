package google;

public class MaxPoints {

    public static void main(String[] args) {
        int[][] points={{1,2,3},{1,5,1},{3,1,1}};
        int[][] points1={{1,5},{2,3},{4,2}};

        System.out.println(getMaxPoints(points));
        System.out.println(getMaxPoints(points1));

    }

    public static long getMaxPoints(int[][] points){

        int rows=points.length;
        int cols=points[0].length;

        long[] dp=new long[cols];


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                dp[j]=dp[j]+points[i][j];
            }

            //left to right parse
            for(int j=1; j<cols; j++){
                dp[j]=Math.max(dp[j], dp[j-1]-1);
            }

            //right to left pass
            for(int j=cols-2; j>=0; j--){
                dp[j]=Math.max(dp[j], dp[j+1]-1);
            }
        }

        long maxPoints=0;
        for(int j=0; j<cols; j++){
            maxPoints=Math.max(maxPoints, dp[j]);
        }


        return maxPoints;

    }

//    We will use just 1 extra array (dp) of size n.
//    Time Complexity: O(mn)
//    Space Complexity: O(n)


}
