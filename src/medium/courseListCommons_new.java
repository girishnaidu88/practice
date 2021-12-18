package medium;

import java.util.*;

public class courseListCommons_new {

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

        Map<Set<String>, List<String>> resMap= coursePair(student_course_pairs_1);

        for(Map.Entry<Set<String>, List<String>> iter: resMap.entrySet()){
            System.out.println(iter.getKey()+" ---> "+iter.getValue());
        }
        System.out.println();

        resMap= coursePair(student_course_pairs_2);

        for(Map.Entry<Set<String>, List<String>> iter: resMap.entrySet()){
            System.out.println(iter.getKey().toString()+" ---> "+iter.getValue().toString());
        }

    }

    public static Map<Set<String>, List<String>> coursePair(String coursePairs [][]) {

        Map<String, List> map = new HashMap<>();
        Map<Set<String>, List<String>> result = new HashMap<>();

        // Create a hashmap of Id as Key and List of courses as value
        for(int i = 0; i < coursePairs.length; i++) {

            String courseNum = coursePairs[i][0];
            String courseName = coursePairs[i][1];
            if(!map.containsKey(courseNum)){
                map.put(courseNum, new ArrayList<>());
            }
            map.get(courseNum).add(courseName);
        }

        // Traverse through every element and find common courses and put them in a separate hashmap
        for(int i= 0; i < coursePairs.length; i++) {
            for(int j= i+1; j < coursePairs.length; j++) {

                String courseNum1 = coursePairs[i][0];
                String courseNum2 = coursePairs[j][0];

                if(map.containsKey(courseNum1) && map.containsKey(courseNum2) && !courseNum1.equals(courseNum2)){

                    List<String> list1 = map.get(courseNum1);
                    List<String> list2 = map.get(courseNum2);
                    List<String> common = commonCourses(list1,list2);

                    Set<String> pair = new HashSet<>();
                    pair.add(courseNum1);
                    pair.add(courseNum2);

//                    for(String c: common){
//                        if(c!=null){
//                            result.put(pair,common);
//                        }
//
//                    }

                    result.put(pair,common);

                }
            }
        }

        return result;
    }

    // Helper method to find common courses
    public static List<String> commonCourses(List<String> list1, List<String> list2){

        List<String> ans = new ArrayList<>();
        for(String s: list1){
            if(list2.contains(s)){
                ans.add(s);
            }
        }
        return ans;
    }
}
