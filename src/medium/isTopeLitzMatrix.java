package medium;

public class isTopeLitzMatrix {

    public static void main(String[] args) {
//        int[][] matrix=
        System.out.println(topeList(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        System.out.println(topeList(new int[][]{{1,2},{2,2}}));
    }

    public static boolean topeList(int[][] matrix){


        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                if(r >0 && c > 0 && matrix[r-1][c-1] != matrix[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
}
