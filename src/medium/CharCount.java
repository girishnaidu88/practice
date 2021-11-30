package medium;

import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        String str1 = "abcdABCDabcd";
        charCount(str1);
    }

    public static void charCount(String s){
        Map<Character, Integer> cMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(!cMap.containsKey(c)){
                cMap.put(c, 1);
            }else{
                cMap.put(c, cMap.get(c)+1);
            }
        }

        System.out.println(cMap);
    }
}
