package medium;

import java.util.*;

public class smiplifyPath {

    public static void main(String[] args) {
        pathSimplify("/a/./b/../../c/");
//        pathSimplify("/../");
//        pathSimplify("/home/");
//        pathSimplify("/home//foo/");
//        pathSimplify("/home//foo/../");
//        pathSimplify("/home//foo/../..");
//
//        simplyPath("/home//foo/../..");
//        simplyPath("/a/./b/..//c/");
//        simplyPath("/home//foo/../");
    }

    public static void pathSimplify(String path){

        Stack<String> stack=new Stack<>();

        for(String s: path.split("/")){
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(s.length()>0 && !s.equals(".")){
                stack.push(s);
            }
        }

        System.out.println("/"+String.join("/", stack));

    }


    public static void simplyPath(String path){

        Stack<String> st=new Stack<>();

        for(String s: path.split("/")){
            if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(s.length()>0 && !s.equals(".")){
                st.push(s);
            }
        }

        System.out.println("/"+String.join("/", st));
    }


























}
