package practice;

import java.util.*;

public class reverseString {


    public static StringBuffer revStr(String str){
        StringBuffer reversedStr=new StringBuffer();

        for(int i=str.length()-1; i>=0; i--){
            reversedStr.append(str.charAt(i));
        }

        return reversedStr;
    }

    public static void main(String[] args){
        System.out.println("Please enter the String to be reversed:");
        Scanner inp = new Scanner(System.in);
        String str=inp.nextLine();
        System.out.println("The Original Str is: "+ str +" and the reversed String is: "+revStr(str));
    }

}
