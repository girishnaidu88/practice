package medium;

import java.util.*;

public class subsetOfArray {

    public static void main(String[] args) {
        System.out.println(subset(new int[]{1,2,3}));
    }

    public static List<List<Integer>> subset(int[] a){

        List<List<Integer>> results= new ArrayList<>();

        if(a==null || a.length ==0){
            return results;
        }

        List<Integer> subset=new ArrayList<>();

        toFindAllSubsets(a, results, subset, 0);

        return results;

    }

    public static void toFindAllSubsets(int[] a, List<List<Integer>> results, List<Integer> subset, int startIndex){

        results.add(new ArrayList<>(subset));

        for(int i=startIndex; i<a.length; i++){
            subset.add(a[i]);
            toFindAllSubsets(a, results, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }


}
