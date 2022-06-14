package medium;

import java.util.Arrays;

public class CanAttendAllMeetings {

    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][]{{11,23},{5,8}}));
        System.out.println(canAttendMeetings(new int[][]{{11,23},{5,11}}));
        System.out.println(canAttendMeetings(new int[][]{{2, 6},{5,8}}));
        System.out.println(canAttendMeetings(new int[][]{{4,1},{5,8}}));
        System.out.println(canAttendMeetings(new int[][]{{1,3},{3,5},{5,8}}));
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }

}
