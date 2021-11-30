package easy;

import java.util.*;

public class validParanthesis {

    public static void main(String[] args) {
//        System.out.println("This is valid: "+isValidParanthesis("{()}{"));
//        System.out.println("This is valid: "+isValidParanthesis("{(a)}"));
//        System.out.println("This is valid: "+isValidParanthesis("{()[[]}"));
//        System.out.println("This is valid: "+isValidParanthesis(""));
//        System.out.println("This is valid: "+isValidParanthesis(" "));
//        System.out.println("This is valid: "+isValidParanthesis("[(])"));


        isValidParanth("{(a)}");
        isValidParanth("{()[]}");
        isValidParanth("{()}{");
    }

    public static boolean isValidParanthesis(String str){
        boolean res=true;
        Stack<Character> s=new Stack<Character>();

        if(str.length()<=1 || str==null || str.charAt(0)=='}' || str.charAt(0)==']' || str.charAt(0)==')'){
            return false;
        }else{
            for(int i=0; i< str.length(); i++){
                char c=str.charAt(i);
                if(!Character.isDigit(c) && !Character.isAlphabetic(c)){
                    if(!s.isEmpty()){
                        if(s.peek()=='(' && c==')'){
                            s.pop();
                        }else if(s.peek()=='{' && c=='}'){
                            s.pop();
                        }else if(s.peek()=='[' && c==']'){
                            s.pop();
                        }else{
                            s.push(c);
                        }
                    }else{
                        s.push(c);
                    }
                }
            }
        }

        return s.size()==0;
    }



    public static void isValidParanth(String str){
        Stack<Character> s= new Stack<Character>();

        if(str.charAt(0)=='}' || str.charAt(0)==')' || str.charAt(0)==']'){
            System.out.println("Not valid Paranthesis");
            return;
        }

        if(str.length()==0){
            System.out.println("Valid Paranthesis");
            return;
        }


        for(int i=0; i<str.length();i++){ //{()}
            char c=str.charAt(i);
            if(!Character.isDigit(c) || !Character.isAlphabetic(c)){
                if(!s.empty()){
                    if(c==')' && s.peek()=='('){
                        s.pop();
                    }else if(c=='}' && s.peek()=='{'){
                        s.pop();
                    }else if(c==']' && s.peek()=='['){
                        s.pop();
                    }else{
                        s.push(c);
                    }
                }else{
                    s.push(c);
                }
            }
        }

        if(s.size()==0){
            System.out.println("This is a valid paranthesis");
        }else{
            System.out.println("This is not valid paranthesis");
        }
    }





























}
