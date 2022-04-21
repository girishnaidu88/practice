package google;

import java.util.*;

public class NoOfMatchingSubSequence {

    public static void main(String[] args) {
        System.out.println(match("abcde", new String[]{"a","bb","acd","ace"}));
        System.out.println(numMatchingSubseq("abcde", new String[]{"a","bb","acd","ace"}));
    }

    static char[] ca, cb;
    public static int match(String s, String[] words){

        int ans=0;

        ca=s.toCharArray();

        for(String word: words){
            if(subSeq(word)){
                ans++;
            }
        }

        return ans;
    }

    public static boolean subSeq(String word){
        int i=0;
        cb=word.toCharArray();

        for(char c: ca){
            if(i < cb.length && c==cb[i]){
                i++;
            }
        }

        return (i==cb.length);
    }


    public static int numMatchingSubseq(String S, String[] words) {
        Map<Character, Queue<String>> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            map.putIfAbsent(S.charAt(i), new LinkedList<>());
        }
        for(String word : words) {
            char c = word.charAt(0);
            if(map.containsKey(c)) {
                map.get(c).offer(word);
            }
        }
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            Queue<String> q = map.get(c);
            int size = q.size();
            for(int k = 0; k < size; k++) {
                String str = q.poll();
                if(str.length() == 1) {
                    count++;
                } else {
                    if(map.containsKey(str.charAt(1))) {
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        return count;
    }

}
