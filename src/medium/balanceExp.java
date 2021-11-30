package medium;

import java.util.*;

public class balanceExp {

    public static void main(String[] args) {
        System.out.println("Given exp matches? => "+matchExp("(){"));
        System.out.println("Given exp matches? => "+matchExp("()"));
    }

    public static boolean matchExp(String str){
        Stack<Character> s=new Stack<Character>();
        if(str.length()==0 || str==null){
            System.out.println("The exp is empty and is valid");
        }else{
            if(str.charAt(0) == '}' || str.charAt(0) == ')' || str.charAt(0) == ']' ||str.charAt(str.length()-1) == '{' || str.charAt(str.length()-1) == '(' || str.charAt(str.length()-1) == '['  ){
                System.out.println("The expression is invalid");
                return false;
            }else{
                for(int i=0; i<str.length();i++) {
                    char c = str.charAt(i);
                    if(!Character.isDigit(c) && !Character.isAlphabetic(c)){
                        if (!s.empty()) {
                            if (s.peek() == '(' && c == ')') {
                                s.pop();
                            } else if (s.peek() == '{' && c == '}') {
                                s.pop();
                            } else if (s.peek() == '[' && c == ']') {
                                s.pop();
                            } else {
                                s.push(c);
                            }
                        } else {
                            s.push(c);
                        }
                    }else {
                        System.out.println("The character: "+c);
//                        continue;
                    }
                }
            }
        }


        return !s.empty()? false: true;
    }

}
