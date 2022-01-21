package medium;

import java.sql.*;
import java.util.*;

public class knigthDialerProb {

    public static void main(String[] args) {
        System.out.println(knightDialer(3131));
        System.out.println(knightDialer(3));
        System.out.println(knightDialer(2));
    }

    public static int knightDialer(int n) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = 0;

        map.put(0, new ArrayList<>(Arrays.asList(4,6)));
        map.put(1, new ArrayList<>(Arrays.asList(6,8)));
        map.put(2, new ArrayList<>(Arrays.asList(7,9)));
        map.put(3, new ArrayList<>(Arrays.asList(4,8)));
        map.put(4, new ArrayList<>(Arrays.asList(3,9,0)));
        map.put(5, new ArrayList<>());
        map.put(6, new ArrayList<>(Arrays.asList(1,7,0)));
        map.put(7, new ArrayList<>(Arrays.asList(2,6)));
        map.put(8, new ArrayList<>(Arrays.asList(1,3)));
        map.put(9, new ArrayList<>(Arrays.asList(2,4)));


        int mod = (int)1e9 + 7;
        int[][] dp = new int[n][10];

        for(int i = 0; i<10; i++)
            dp[0][i] = 1;

        for(int i = 1; i<n; i++) {
            for(int j = 0; j<10; j++) {
                for(int m : map.get(j)) {
                    dp[i][j] += dp[i-1][m];
                    dp[i][j] %=mod;
                }
            }
        }

        for(int i = 0; i<10; i++) {
            ans+=dp[n-1][i];
            ans %=mod;
        }
        return ans;
    }
}
