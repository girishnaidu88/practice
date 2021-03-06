package top75;

import java.util.*;

public class wordBreak {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("pen");
        System.out.println(wordBreak("applepenapple", list));
        System.out.println(wordBreak("applepens", list));
    }


    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
