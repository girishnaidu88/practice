package practice;

import java.util.*;

public class IsOnlyAlphabet {


    public static boolean isAlphaOnly(String str){
        return ((str!="") && (str!=null) && (str.chars().allMatch(Character::isLetter)));
    }

    public static boolean isOnlyAlpa(String str){
        boolean flag=true;
        char[] cArr = str.toCharArray();

        if((str!="") && (str!=null)){
            for (int i=0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    flag=false;
                    System.out.println("The index: "+i);
                    break;
                }
            }
        }else{
            System.out.println("Inside the else");
            flag=false;
        }



//        for (int i=0; i<cArr.length; i++){
//
//            if(!Character.isLetter(cArr[i])){
//                flag=false;
//                System.out.println("The index: "+i);
//                break;
//            }
//
//        }
        return flag;
    }

    public static boolean isOnlyAlpaUsingUsingCharArray(String str){
        boolean flag=true;
        char[] cArr = str.toCharArray();

        if((str!="") && (str!=null)){
            for (int i=0; i<cArr.length; i++){
                if(!Character.isLetter(cArr[i])){
                    flag=false;
                    System.out.println("The index: "+i);
                    break;
                }
                System.out.println("The outside index: "+i);
            }
        }else{
            System.out.println("Inside the else");
            flag=false;
        }
        return flag;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str= inp.nextLine();
        System.out.println("Enter the Second string");
        String str1=inp.nextLine();

        System.out.println(isAlphaOnly(str));
        System.out.println(isAlphaOnly(str1));
        System.out.println(isOnlyAlpa(str));
        System.out.println(isOnlyAlpa(str1));
        System.out.println(isOnlyAlpaUsingUsingCharArray(str));
        System.out.println(isOnlyAlpaUsingUsingCharArray(str1));


        String name= "Giri";
        name.length();

        int[] arr= new int[]{1,2,3,4};
        int size=arr.length;
    }

}
