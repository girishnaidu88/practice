package easy;

import java.sql.*;

public class isPalindromeStr {

    public static void main(String[] args){

        System.out.println("Is Palindrome ->"+isPalindrome("am12 21ma"));
        System.out.println("Is Palindrome ->"+isPalindrome("amMa"));
        int num=21212;
        if(num==isValidPalindromeInt(num)){
            System.out.println("This is a valid palindrome");
        }else{
            System.out.println("Not a valid palindrome");
        }

    }

    public static boolean isPalindrome(String str){

        int l=0; int r=str.length()-1;
        int mid=(l+r)/2;
        while(l <= mid){
            if(str.charAt(l)==str.charAt(r)){
                l++; r--;
            }else{
                return false;
            }
        }

        return true;
    }

    public static int isValidPalindromeInt(int num){
        int result=0;

        if(num<0){
            return -1;
        }else{
            while(num != 0){
                int tail=num%10;
                int newRes=result*10+tail;
                if((newRes-tail)/10 !=result){
                    return 0;
                }
                result=newRes;
                num=num/10;
            }
        }

        return result;
    }
}
