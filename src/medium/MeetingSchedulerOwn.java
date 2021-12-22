package medium;

import java.util.*;

public class MeetingSchedulerOwn {
    public static void main(String[] args) {
        int[][] p1Meetings = {{1230, 1300}, {845, 900}, {1300, 1500}};
        int[][] p2Meetings = {{ 0, 844 }, {930, 1200}, {1515, 1546}, {1600, 2400}};
        int[][] p3Meetings = {{845, 915}, {1515, 1545}, {1235, 1245}};
        int[][] p4Meetings = {{1, 5}, {844, 900}, {1515, 1600}};

        List<int[][]> schedules1=Arrays.asList(p1Meetings, p2Meetings, p3Meetings);
        List<int[][]> schedules2= Arrays.asList(p1Meetings, p3Meetings);
        List<int[][]> schedules3= Arrays.asList(p2Meetings, p4Meetings);

        List<int[]> finalRes= findSchedules(schedules1);
        for(int[] res: finalRes){
            System.out.println("[ " + res[0]+"-->"+res[1]+" ]" );
        }
        System.out.println();
        finalRes= findSchedules(schedules2);
        for(int[] res: finalRes){
            System.out.println("[ " + res[0]+"-->"+res[1]+" ]" );
        }
        System.out.println();
        finalRes= findSchedules(schedules3);
        for(int[] res: finalRes){
            System.out.println("[ " + res[0]+"-->"+res[1]+" ]" );
        }


    }

    public static List<int[]> findSchedules(List<int[][]> schedules){
        List<int[]> combinedList= new ArrayList<>();


        //Adding all the schedules into the list
        for(int[][] participant: schedules){
            for(int[] pa: participant){
                combinedList.add(pa);
            }
        }

        Collections.sort(combinedList, (a,b) -> a[0] > b[0] ? 1: -1);

        List<int[]> result=new ArrayList<>();

        int min=combinedList.get(0)[0];
        int max=combinedList.get(0)[1];

        if(min > 0){
            int[] temp={0, min};
            result.add(temp);
        }

        for(int i=0; i<combinedList.size(); i++){
            if(max < combinedList.get(i)[0]){
                int[] temp={max, combinedList.get(i)[1]};
                result.add(temp);
                max=combinedList.get(i)[1];
            }else{
                max=Math.max(max, combinedList.get(i)[1]);
            }
        }

        if(max < 2400){
            int[] temp={max, 2400};
            result.add(temp);
        }

        return result;

    }
}