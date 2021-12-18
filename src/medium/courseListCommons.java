package medium;

import java.util.*;

public class courseListCommons {

    public static void main(String[] args) {
        String[][] student_course_pairs_1 = {
                {"58", "Linear Algebra"},
                {"94", "Art History"},
                {"94", "Operating Systems"},
                {"17", "Software Design"},
                {"58", "Mechanics"},
                {"58", "Economics"},
                {"17", "Linear Algebra"},
                {"17", "Political Science"},
                {"94", "Economics"},
                {"25", "Economics"},
                {"58", "Software Design"}
        };


        String[][] student_course_pairs_2 = {
                {"42", "Software Design"},
                {"0", "Advanced Mechanics"},
                {"9", "Art History"}
        };

        Map<Set<String>, List<String>> resMap= findCommonCourses(student_course_pairs_1);

        for(Map.Entry<Set<String>, List<String>> iter: resMap.entrySet()){
            System.out.println(iter.getKey().toString()+" ---> "+iter.getValue().toString());
        }
        System.out.println();

        resMap= findCommonCourses(student_course_pairs_2);

        for(Map.Entry<Set<String>, List<String>> iter: resMap.entrySet()){
            System.out.println(iter.getKey().toString()+" ---> "+iter.getValue().toString());
        }

    }

    public static Map<Set<String>, List<String>> findCommonCourses(String[][] courseList){
        Map<Set<String>, List<String>> commonPairs=new HashMap<>();

        Map<String, List<String>> map=new HashMap<>();


        for(int i=0; i<courseList.length; i++){
            String courseNum=courseList[i][0];
            String courseName=courseList[i][1];

            if(!map.containsKey(courseNum)){
                map.put(courseNum, new ArrayList<>());
            }

            map.get(courseNum).add(courseName);
        }


        for(int i=0; i<courseList.length; i++){
            for(int j=i+1; j<courseList.length; j++){
                String courseNum1=courseList[i][0];
                String courseNum2=courseList[j][0];

                if(map.containsKey(courseNum1) && map.containsKey(courseNum2) && !courseNum1.equals(courseNum2)){
                    List<String> list1=map.get(courseNum1);
                    List<String> list2=map.get(courseNum2);

                    List<String> commons=getCommonCourses(list1, list2);
                    Set<String> pairs=new HashSet<>();
                    pairs.add(courseNum1);
                    pairs.add(courseNum2);


                    commonPairs.put(pairs, commons);
                }
            }
        }

//        System.out.println(commonPairs.toString());
        return commonPairs;
    }

    public static List<String> getCommonCourses(List<String> list1, List<String> list2){
        List<String> ans=new ArrayList<>();

        for(String st: list1){
            if(list2.contains(st)){
                ans.add(st);
            }
        }

        return ans;
    }
}
