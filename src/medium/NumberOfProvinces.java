package medium;

public class NumberOfProvinces {

    public static void main(String[] args){

        System.out.println("The count is: "+isConnected(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
        System.out.println("The count is: "+isConnected(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
        System.out.println("The count is: "+isConnected(new int[][]{{1,1,0},{1,1,1},{0,1,1}}));
    }

    public static int isConnected(int[][] arr){
        int count=0;
        int[] visited=new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(visited[i]==0){
                dfs(arr, visited, i);
                count++;
            }
        }

        return count;
    }

    public static void dfs(int[][] arr, int[] visited, int i){
        for(int j=0; j<arr.length; j++){
            if(arr[i][j]==1 && visited[j]==0){
                visited[j]=1;
                dfs(arr, visited, j);
            }
        }
    }

}
