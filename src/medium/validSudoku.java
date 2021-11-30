package medium;

import java.util.*;

public class validSudoku {

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        if(validOrNot(board)){
            System.out.println("Valid sudoku");
        }else{
            System.out.println("Not valid sudoku");
        }

        if(isValidSudoku(board)){
            System.out.println("Valid sudoku");
        }else{
            System.out.println("Not valid sudoku");
        }
    }

    public static boolean isValidSudoku(char[][] board){

        Set seen=new HashSet();

        for(int i=0; i<9; ++i){
            for(int j=0; j<9; ++j){
                if(board[i][j]!='.'){
                    String b= "("+board[i][j]+")";
//                    System.out.println("The value of b: "+b +"---->"+i+b+"---->"+b+j+"---->"+(i/3+b+j/3));
                    if(!seen.add(i+b) || !seen.add(j+b) || !seen.add(i/3 + b + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;

    }



    public static boolean validOrNot(char[][] board){
        Set s=new HashSet();

        for(int i=0; i<9; i++){
            for(int j=0; j<9;j++){

                if(board[i][j] !='.'){
                    String b= "("+board[i][j]+")";

                    if(!s.add(i+b) || !s.add(b+j) || !s.add(i/3 +b +j/3)){
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
