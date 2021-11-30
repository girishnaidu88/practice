package medium;

import java.util.*;

public class MatchArraysUsingSet {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,4};

        System.out.println(sameElements(a1, a2));
        System.out.println(sameElements(a1, a3));
    }


    public static boolean sameElements(Integer[] a, Integer[] b){

        Set<Object> s1 = new HashSet<>(Arrays.asList(a));
        Set<Object> s2 = new HashSet<>(Arrays.asList(b));

        if(s1.size()!=s2.size()){
            System.out.println("Inside If");
            return false;
        }

        for(Object obj: s1){
            if(!s2.contains(obj)){
                return false;
            }
        }

        return true;
    }

}
