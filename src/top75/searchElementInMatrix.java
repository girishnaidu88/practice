package top75;

public class searchElementInMatrix {

    public static void main(String[] args) {
        int[][] sortedMatrix =
                {
                        { -1, 6, 10, 12, 20 },
                        { 4, 8, 15, 22, 25 },
                        { 5, 20, 35, 37, 40 },
                        { 10, 28, 38, 45, 55 }
                };

        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, 55));
        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, 35));

        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, -1));
        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, -11));
    }

    public static boolean searchElementInSortedMatrix(int[][] matrix, int ele){

        int R=matrix.length;
        int C=matrix[0].length;
        int r=0, c=C-1;

        while(r < R && c >=0 ){
            if(matrix[r][c]==ele){
                return true;
            }

            if(ele < matrix[r][c]){
                c=c-1;
            }else{
                r=r+1;
            }
        }

        return false;
    }
}
