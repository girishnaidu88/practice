package medium;

public class islandNeighborsPerimeter {

    public static void main(String[] args) {
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(findPerimeter(grid));
        }


    public static int findPerimeter(int[][] grid) {

        for(int i=0 ; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return getNeighborCount(grid, i, j);
                }
            }
        }

        return 0;
    }

    public static int getNeighborCount(int[][] grid, int i, int j){

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return 1;
        }

        if(grid[i][j]==-1){
            return 0;
        }

        if(grid[i][j]==0){
            return 1;
        }

        int count=0;
        grid[i][j]=-1;

        count=count+getNeighborCount(grid, i-1, j);
        count=count+getNeighborCount(grid, i+1, j);
        count=count+getNeighborCount(grid, i, j-1);
        count=count+getNeighborCount(grid, i, j+1);


        return count;
    }


}
