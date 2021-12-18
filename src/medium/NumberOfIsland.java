package medium;

class NumberOfIsland {

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','1'},
                {'1','0','1','0','1'}};

        int[][] grid1={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println("The no.of Islands: "+numIslands(grid));
        islandNeighbours(grid1);
    }

    public static int numIslands(char[][] grid) {
        int noOfIslands =0;

        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j]=='1')
                {
                    noOfIslands++;
                    findIsland(grid,i,j);
                }
            }
        }

        return noOfIslands;
    }

    public static void findIsland(char[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')
        {
            return;
        }

        grid[i][j]='0';

        findIsland(grid,i-1,j);
        findIsland(grid,i+1,j);
        findIsland(grid,i,j-1);
        findIsland(grid,i,j+1);
    }

    public static void islandNeighbours(int[][] grid){

        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(count==0){
                    if(grid[i][j]==1) {
                        ans+=4; count++;
                    }
                }
                else
                {
                    if(grid[i][j]==1 && grid[i][j-1]==1) ans+=2;
                    if(grid[i][j]==1 && grid[i][j-1]==0) ans+=4;
                }

            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(grid[j][i]==1 && grid[j+1][i]==1) {
                    ans-=2;
                }

            }
        }
        System.out.println("The neighbors are: "+ans);

    }
}
