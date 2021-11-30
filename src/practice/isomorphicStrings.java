package practice;

import java.util.*;

public class isomorphicStrings {

    public static void main(String[] args) {
        System.out.println("The strings are Isomorphic:"+isIsomorphic("foO","boo"));
        System.out.println("The strings are Isomorphic:"+isIsomorphicWithIgnoreCase("foO","boo"));
    }

    public static boolean isIsomorphic(String s, String t){

        if(s.length()!=t.length()){
            System.out.println("UnEqual lengths");
            return false;
        }
        String[] s1=s.split("");
        String[] s2=t.split("");

        Set set1=new HashSet(Arrays.asList(s1));
        Set set2=new HashSet(Arrays.asList(s2));

        if(set1.size()!= set2.size()){
            return false;
        }

        return true;
    }

    public static boolean isIsomorphicWithIgnoreCase(String s, String t){

        if(s.length()!=t.length()){
            System.out.println("Unequal lengths");
            return false;
        }

        String[] sArr=s.toLowerCase().split("");
        String[] tArr=t.toLowerCase().split("");

        Set set1=new HashSet(Arrays.asList(sArr));
        Set set2=new HashSet(Arrays.asList(tArr));


        return set1.size()==set2.size() ? true: false;
    }

}
