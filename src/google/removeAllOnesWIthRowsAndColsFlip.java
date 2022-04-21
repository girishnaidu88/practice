package google;

public class removeAllOnesWIthRowsAndColsFlip {

    public static void main(String[] args) {
        System.out.println(removeOnes(new int[][]{{0,1,0},{1,0,1},{0,1,0}}));
        System.out.println(removeOnes(new int[][]{{1,1,0},{1,0,1},{0,1,0}}));
        System.out.println(removeOnes(new int[][]{{1,1,0},{0,0,0},{0,0,0}}));
        System.out.println(removeOnes(new int[][]{{1,1}}));
        System.out.println(removeOnes(new int[][]{{1,0},{0,1}}));
        System.out.println(removeOnes(new int[][]{{1}}));
        System.out.println(removeOnes(new int[][]{{0}}));
    }

    public static boolean removeOnes(int[][] grid){

        int rows=grid.length;
        int cols=grid[0].length;

        boolean[] flippedcols=new boolean[cols];

        for(int c=0; c<cols; c++){
            if(grid[0][c]==1 && !flippedcols[c]){
                flippedcols[c]=true;

                for(int i=0; i<rows; i++){
                    grid[i][c]=(grid[i][c]==0) ? 1 : 0;
                }
            }
        }

        for(int r=1; r<rows; r++){
            for(int c=0; c<cols-1; c++){
                if(grid[r][c] != grid[r][c+1]){
                    return false;
                }
            }
        }


        return true;
    }

}
