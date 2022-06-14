package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateEntries {

    public static void main(String[] args) {
        System.out.println("This input conatins duplicates: "+conatainsDuplicateIter(new int[]{1,1,2,-3,5,3,4}));
        System.out.println("This input conatins duplicates: "+conatainsDuplicateSorting(new int[]{1,2,-3,5,3,4}));
        System.out.println("This input conatins duplicates: "+containsDuplicateHashmap(new int[]{1,2,-3,5,3,4,1}));
    }

    //Time: O(n2) and space: O(1)
    public static boolean conatainsDuplicateIter(int[] values){
        for(int i=0; i<values.length; i++){
            for(int j=i+1; j<values.length; j++){
                if(values[i]==values[j]){
                    return true;
                }
            }
        }

        return false;
    }

    //Time: Sorting is O(n \log n)O(nlogn) and the sweeping is O(n). The entire algorithm is dominated by the sorting step, which is O(n \log n)O(nlogn).
    // and space: O(1)
    public static boolean conatainsDuplicateSorting(int[] values){
        Arrays.sort(values);
        for(int i=0; i< values.length-1; i++){
            if(values[i]==values[i+1]){
                return true;
            }
        }
        return false;
    }

    //Time: O(n) and space O(n)
    public static boolean containsDuplicateHashmap(int[] values){
        Map<Integer, Integer> resMap=new HashMap<>();
        for(int i=0; i<values.length; i++){
            if(resMap.containsKey(values[i])){
                return true;
            }
            resMap.put(values[i], i);
        }

        return false;
    }
}
