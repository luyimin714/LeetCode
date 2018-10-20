package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        int[] indegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            indegree[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        int index = 0;
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
                order[index++] = i;
            }
        }

        while(!queue.isEmpty()){
            int pre = queue.poll();
            for(int i = 0; i < prerequisites.length; i++){
                if(prerequisites[i][1] == pre){
                    indegree[prerequisites[i][0]]--;
                    if(indegree[prerequisites[i][0]] == 0){
                        order[index++] = prerequisites[i][0];
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return (index == numCourses) ? order : new int[0];
    }
}
