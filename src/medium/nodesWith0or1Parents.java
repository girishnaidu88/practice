package medium;

import java.util.*;

public class nodesWith0or1Parents {

    public static void main(String[] args){
        int[][] edges={{1,4}, {1,5}, {2,5}, {3,6}, {6,7}};
        findParents(edges);
    }

    public static void findParents(int[][] edges){
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
//        result.add(new ArrayList<>());

        Map<Integer, Integer> pm=new HashMap<>();

        for(int[] edge: edges){
            pm.put(edge[1], pm.getOrDefault(edge[1], 0)+1);
            pm.put(edge[0], pm.getOrDefault(edge[0], 0));
        }

        for(Integer node: pm.keySet()){
            if(pm.get(node)==0){
                result.get(0).add(node);
            }else if(pm.get(node)==1){
                result.get(1).add(node);
//            }else{
//                result.get(2).add(node);
            }
        }

        System.out.println(result.toString());
    }

}
