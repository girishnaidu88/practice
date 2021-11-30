package medium;

import java.util.*;

public class groupAnagrams {

    public static void main(String[] args) {

        anagransGroups(new String[]{"eat","tea","tan","ate","nat","bat"});
        grpAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public static void anagransGroups(String[] str){

        Map<String, List<String>> map=new HashMap<>();

        for(String s: str){
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String keyStr=String.valueOf(ca);

            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);

        }
        System.out.println("the key set: "+map.keySet());
        System.out.println("The set of grouped anagrams: "+map.values());
    }


    public static void grpAnagrams(String[] str){
        Map<String, List<String>> map= new HashMap<>();

        for(String s: str){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String keyStr=String.valueOf(c);

            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }

        System.out.println(map.values());
    }































}
