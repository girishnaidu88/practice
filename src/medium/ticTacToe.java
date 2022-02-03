package medium;

public class ticTacToe {

    static int[] rows;
    static int[] cols;
    static int diagonal, antiDiagonal;

    public ticTacToe(int n){
        rows = new int[n];
        cols = new int[n];
    }

    public static int move(int row, int col, int player){
        int currPlayer= (player==1)? 1: -1;

        rows[row] += currPlayer;
        cols[col] += currPlayer;

        if(col == row){
            diagonal += currPlayer;
        }

        if(col == (cols.length-row-1)){
            antiDiagonal += currPlayer;
        }

        int n=rows.length;

        if(Math.abs(rows[row])==n || Math.abs(cols[col])==n || Math.abs(diagonal)==n ||Math.abs(antiDiagonal)==n){
            return player;
        }

        return 0;
    }

    public static void main(String[] args) {

    }

}
