package medium;

public class islandMaxArea {

    public static void main(String[] args) {
//        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] grid={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(findArea(grid));
    }

    public static int findArea(int[][] grid){
        int ans=0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                ans=Math.max(ans, maxArea(grid, i, j));
            }
        }
        return ans;
    }


    public static int maxArea(int[][] grid, int i, int j){
        if(i <0 || i==grid.length || j<0 || j==grid[0].length ){
            return 0;
        }

        if(grid[i][j]!=1){
            return 0;
        }

        grid[i][j]=2;

        return 1+ maxArea(grid, i-1, j) + maxArea(grid, i+1, j) + maxArea(grid, i, j-1) + maxArea(grid, i, j+1);
    }

}
