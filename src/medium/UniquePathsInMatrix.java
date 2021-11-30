package medium;

public class UniquePathsInMatrix {

    public static void main(String[] args) {
        System.out.println(uniquePathsRecurssion(3,3));
        System.out.println(uniquePathsIterative(3,3));


    }

    public static int uniquePathsRecurssion(int rows, int cols){

        if(rows==1 || cols==1){
            return 1;
        }

        return uniquePathsRecurssion(rows-1, cols) + uniquePathsRecurssion(rows, cols-1);
    }


    public static int uniquePathsIterative(int rows, int cols){

        int[][] countPaths=new int[rows][cols];

        //Counts all reachable nodes
        for(int i=0; i<rows; i++){
            countPaths[i][0]=1;
        }

        for(int j=0; j<cols; j++){
            countPaths[0][j]=1;
        }

        for(int i=1; i<rows; i++){
            for(int j=1; j<cols;j++){
                countPaths[i][j]=countPaths[i-1][j] + countPaths[i][j-1];
            }
        }
        return countPaths[rows-1][cols-1];

    }
}
