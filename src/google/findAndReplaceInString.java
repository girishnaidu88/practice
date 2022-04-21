package google;

import java.util.*;

public class findAndReplaceInString {

    public static void main(String[] args) {
//        Idea: Use a StringBuilder to build up the result.
//        1. Iterate through the indexes array and find out all indices that support replacement. Then, store mappings from those index values to their indices in the indexes array into a map named indexValueToIndex.
//        2. Iterate through str, at each iteration i, check whether we can perform replacement, i.e., indexValueToIndex.get(i) != null,
//        if yes, append targets[i] to the StringBuilder and increase i by sources[i].length() - 1
//        if no, append str.charAt(i) and increment i
//
//        Complexity - Time: O(n), Space: O(l) where n is str.length() and l is indexes.length

        System.out.println(findAndRelpace("abcd", new int[]{0,2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"}));
        System.out.println(findAndRelpace("abcd", new int[]{0,2}, new String[]{"a", "ec"}, new String[]{"eee", "ffff"}));


    }

    public static String findAndRelpace(String s, int[] indexes, String[] source, String[] targets){
        StringBuilder sb=new StringBuilder();

        Map<Integer, String> sMap=new HashMap<>();
        Map<Integer, String> tMap=new HashMap<>();

        for(int i=0; i<indexes.length; i++){
            sMap.put(indexes[i], source[i]);
            tMap.put(indexes[i], targets[i]);
        }

        int i=0;
        while(i < s.length()){
            if(sMap.containsKey(i) && s.startsWith(sMap.get(i), i)){
                sb.append(tMap.get(i));
                i= i+sMap.get(i).length();
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

}
