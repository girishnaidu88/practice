package medium;

public class wordSearch {
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(search(board, "SEE"));
        System.out.println(search(board, "SEED"));
        System.out.println(search(board, "BFCC"));
        System.out.println(search(board, "SEEF"));
        System.out.println(search(board, "ABc"));
    }

    public static boolean search(char[][] board, String word){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board, i, j, word, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board, int i, int j, String word, int index){
        if(index==word.length()){
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j]){
            return false;
        }

        char temp=board[i][j];
        board[i][j]=' ';
        boolean found= dfs(board, i+1, j, word, index+1) ||
                        dfs(board, i-1, j, word, index+1) ||
                        dfs(board, i, j+1, word, index+1) ||
                        dfs(board, i, j-1, word, index+1) ;
        board[i][j]=temp;
        return found;

    }

}
