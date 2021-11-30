package medium;

import java.util.*;

public class longestSubStringWoRepeatingCharaters {

    public static void main(String[] args) {
        longestSubStringBF("lalbcda");
        longestSubStringBF("girish");
        longestSubStringBF(" ");
        longestSubStringBF("abab");
        longestSubstring("aba");
        longestSubstring("lalbcda");
        longestSubstring("girish");

    }

    public static void longestSubStringBF(String str){

        int start=0, maxLen=0;
        StringBuffer sb=new StringBuffer();
        Map<Character, Integer> hMap=new HashMap<>();

        if(str.length()==0 || str==null){
            System.out.println("The longest subString length is "+start);
        }else{
            for(int i=0; i< str.length(); i++){
                if(hMap.containsKey(str.charAt(i))){
                    start= Math.max(start, hMap.get(str.charAt(i))+1);
                }
                hMap.put(str.charAt(i), i);
                maxLen=Math.max(maxLen, i-start+1);
            }
        }

        System.out.println("The length of the longest subString is: "+maxLen);

    }


    public static void longestSubstring(String str){
        if(str.length()<=1){
            System.out.println(str);
            return;
        }

        Map<Character, Integer> map=new HashMap<>();
        int start=0, maxLen=0;

        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);

            if(map.containsKey(c)){
                start=Math.max(start, map.get(c)+1);
            }

            map.put(c, i);
            maxLen=Math.max(maxLen, i-start+1);
        }

        System.out.println("The max len is: "+(maxLen)+" and which starts at: "+(start));
    }






























}
