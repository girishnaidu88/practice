package google;

import java.util.*;

public class reversePolishNotation {
    public static void main(String[] args) {
        System.out.println(rpn(new String[]{"2","-1","/","3","*"}));
        System.out.println(rpn(new String[]{"4","13","5","/","+"}));
        System.out.println(rpn(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int rpn(String[] tokens){
        int a,b;
        Stack<Integer> st=new Stack<>();

        for(String s: tokens){
            if(s.equals("+")){
                st.add(st.pop()+st.pop());
            }else if(s.equals("*")){
                st.add(st.pop()*st.pop());
            }else if(s.equals("/")){
                b=st.pop();
                a=st.pop();
                st.add(a/b);
            }else if(s.equals("-")){
                b=st.pop();
                a=st.pop();
                st.add(a-b);
            }else{
                st.add(Integer.parseInt(s));
            }
        }

        return (st.size()==1) ? st.peek(): -1;
    }
}
