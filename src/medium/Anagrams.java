package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println("The 2 string are anagrams: "+ isAnagrams("a b   c", " ba   c"));
        anagramsHashMap("abac", "aabc");
        anagramsHashMap("abac", "aabb");
        anagramsHashMap("abac", "aabba");
        anagramsHashMap("", "");
        anagramsHashMap("a b   c", " ba   c");

    }

    public static boolean isAnagrams(String s, String a){
        if(s.length()==a.length()){
            char[] sArr = s.toCharArray();
            char[] aArr=a.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(aArr);

            for(int i=0; i<sArr.length; i++){
                if(!(sArr[i]==aArr[i])){
                    return false;
                }
            }
        }else{
            return false;
        }

        return true;
    }


    public static void anagramsHashMap(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("Not anagrans - Sizes are not equal");
            return;
        }

        Map<Character, Integer> hmap=new HashMap<Character, Integer>();

        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
//            System.out.println("The S1 char is: "+c);
            if(!hmap.containsKey(c)){
                hmap.put(c, 1);
            }else{
                hmap.put(c, hmap.get(c)+1);
            }
        }
//        System.out.println("\n");
//        System.out.println("The count is: "+hmap.size());

        for(int i=0; i<s2.length(); i++){
            char c=s2.charAt(i);
//            System.out.println("The S2 char is: "+c);
            if(!hmap.containsKey(c)){
                System.out.println("Not anagrans - Contains different chars");
                return;
            }else if(hmap.containsKey(c)){
                int count=hmap.get(c);
                if(count>1){
                    hmap.replace(c, count, count-1);
                }else{
                    hmap.remove(c);
                }
            }
        }

//        System.out.println("The count after s2 delete is: "+hmap.size());
        if(hmap.size()==0){
            System.out.println("The given 2 strings are ANAGRANS");
        }else{
            System.out.println("Not anagrams !!");
        }

    }
}
