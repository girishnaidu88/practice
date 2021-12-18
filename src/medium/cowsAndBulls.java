package medium;

import java.sql.*;

public class cowsAndBulls {


    public static void main(String[] args) {
        String secret = "11", guess = "01";

        System.out.println(findCowsBulls(secret, guess));
    }

    public static String findCowsBulls(String secret, String guess){

        if(secret.length()==guess.length()){
            int cows=0, bulls=0;
            int[] numbers=new int[secret.length()+guess.length()];

            for(int i=0; i<secret.length(); i++){
                if(secret.charAt(i)==guess.charAt(i)){
                    bulls++;
                }else{
                    if(numbers[secret.charAt(i)-'0']++ < 0){
                        cows++;
                    }
                    if(numbers[guess.charAt(i)-'0']-- > 0){
                        cows++;
                    }
                }
            }


            return bulls+"A"+cows+"B";
        }
        return "Invalid input";
    }

}
