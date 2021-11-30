package medium;

public class minCostPathProg {

    public static void main(String[] args) {
        int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };

        int cost1[][] = { {1, 2, 3},
                {3,2,1},
                {1,1,1,} };

//        System.out.println(minCost(cost, 2,2));
        System.out.println("The min cost path is: "+minCostPath(cost));
        System.out.println("The min cost path is: "+minCostPath(cost1));
    }

    public static int minCost(int[][] cost, int m, int n){

        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }else if(m==0 && n==0){
            return cost[m][n];
        }else{
            return cost[m][n] + min(minCost(cost, m-1, n-1),
                    minCost(cost, m-1,n),
                    minCost(cost, m, n-1));
        }
    }

    public static int min(int x, int y, int z){
        if(x < y){
            return x<z ? x : z;
        }else{
            return y<z? y : z;
        }
    }


    public static int minCostPath(int[][] a){
        if(a.length<1){
           return 0;
        }

        int rows=a.length;
        int cols=a[0].length;

        int[][] dp=new int[a.length][a[0].length];

        int i,j;
        dp[0][0]=a[0][0];

        //fill first row
        for( i=1; i<cols; i++){
            dp[0][i]=dp[0][i-1]+a[0][i];
        }

        //fill first coll
        for( i=1; i<rows;i++){
            dp[i][0]=dp[i-1][0]+a[i][0];
        }

        //fill others
        for( i=1; i<rows; i++){
            for( j=1; j<cols;j++){
                dp[i][j]=a[i][j]+Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }


        return dp[rows-1][cols-1];
    }































}
