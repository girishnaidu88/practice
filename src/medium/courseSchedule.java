package medium;

import java.util.*;

public class courseSchedule {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        courseSchedule cs=new courseSchedule();
        System.out.println(cs.canFinish(numCourses, prerequisites));
        System.out.println(cs.canFinish(numCourses, new int[][]{{1,0},{0,1}}));
    }

    enum State { INIT, VISITING, VISITED }

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<Integer>[] graph = new List[numCourses];
            State[] state = new State[numCourses];

            for (int i = 0; i < graph.length; ++i)
                graph[i] = new ArrayList<>();

            for (int[] p : prerequisites)
                graph[p[1]].add(p[0]);

            for (int i = 0; i < numCourses; ++i)
                if (hasCycle(graph, i, state))
                    return false;

            return true;
        }

        private boolean hasCycle(List<Integer>[] graph, int node, State[] state) {
            if (state[node] == State.VISITING)
                return true;
            if (state[node] == State.VISITED)
                return false;

            state[node] = State.VISITING;
            for (final int child : graph[node])
                if (hasCycle(graph, child, state))
                    return true;
            state[node] = State.VISITED;

            return false;
        }


}
