package medium;

public class UniqueLettersinString {

    public static void main(String[] args) {
        System.out.println(uniqueLetterString("ABC"));
        System.out.println(uniqueLetterString("ABA"));
        System.out.println(uniqueLetterString("LEETCODE"));
    }

    public static int uniqueLetterString(String S) {

        int res = 0;
        if (S == null || S.length() == 0)
            return res;
        int[] showLastPosition = new int[128];
        int[] contribution = new int[128];
        int cur = 0;
        for (int i = 0; i < S.length(); i++) {
            char x = S.charAt(i);
            cur -= contribution[x];
            contribution[x] = (i - (showLastPosition[x] - 1));
            cur += contribution[x];
            showLastPosition[x] = i + 1;
            res += cur;
        }
        return res;
    }
}
