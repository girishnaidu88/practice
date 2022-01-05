package medium;

import java.util.*;

public class AdvisaryCourses {

    public static void findAdvisoryMeetingCourse(String[][] preReqCourses) {

        List<String> totalCourse= new ArrayList<>();
        Map<String,Set<String>> map = new HashMap<>();

        for(String[] course : preReqCourses){
            totalCourse.add(course[0]);
            totalCourse.add(course[1]);
            map.put(course[1],map.getOrDefault(course[1], new HashSet<>()));
            map.get(course[1]).add(course[0]);
        }

        Queue<String> queue= new LinkedList<>(); // indegree 0 queue
        List<String> order = new ArrayList<>(); // maintains the topological order

        for(String course : totalCourse){
            if(!map.containsKey(course)){
                queue.offer(course);
                order.add(course);
            }
        }

        while(!queue.isEmpty()){
            String course =queue.poll();

            for(Map.Entry<String,Set<String>> entry : map.entrySet()){
                if(entry.getValue().contains(course)){
                    entry.getValue().remove(course);
                    if(entry.getValue().size()==0){
                        queue.offer(entry.getKey());
                        order.add(entry.getKey());
                    }
                }
            }

        }

        for(String s: order){
            System.out.println(s);  //  this outputs complete order
        }
        System.out.println("Middle Elements");
        if(order.size()%2==0){
            System.out.println(order.get(order.size()/2)+ "  " + order.get(order.size()/2+1));
        }
        else{
            System.out.println(order.get(order.size()/2));
        }

    }

    public static void main(String[] args) {
        String[][] prereqs_courses = new String[][]{
                {"Foundations of Computer Science", "Operating Systems"},
                {"Data Structures", "Algorithms"},
                {"Computer Networks", "Computer Architecture"},
                {"Algorithms", "Foundations of Computer Science"},
                {"Computer Architecture", "Data Structures"},
                {"Software Design", "Computer Networks"}
        };

        findAdvisoryMeetingCourse(prereqs_courses);
    }
}
