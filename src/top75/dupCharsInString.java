package top75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dupCharsInString {

    public static void main(String[] args) {

        String str1="abcdsased";
        String str2="qwertyuiopasdfghjklzxcvbnm,.";
        dupCharsUsingHashMap(str1);
        dupCharsUsingHashSet(str1);
        dupCharsUsingHashMap(str2);
        dupCharsUsingHashSet(str2);
    }

    public static void dupCharsUsingHashMap(String str){
        Map<Character, Integer> hmap=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(hmap.containsKey(str.charAt(i))){
                System.out.println("The first repeating char is (map): "+str.charAt(i));
                hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
            }else{
                hmap.put(str.charAt(i), 1);
            }
        }

        System.out.println("Printing the content od hmap:");
        for(Character c: hmap.keySet()){
            System.out.println(c +" --> "+hmap.get(c));
        }
    }


    public static void dupCharsUsingHashSet(String str){
        Set<Character> set= new HashSet<>();

        for(int i=0; i<str.length(); i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
            }else{
                System.out.println("The first repeating char is (Set): "+str.charAt(i));
            }
        }

        System.out.println("The content of the set is: "+String.valueOf(set));
    }

}
