package easy;

import java.util.*;

public class removeDuplcatesFromSortedArrays {

    public static void main(String[] args) {
        removesDupsSortedArraysBF(new int[]{0,0,1,1,1,2,2,3,3,4,4,7,7,7,7});
        removesDupsSortedArraysBF(new int[]{0,0,1,1});
        removesDupsSortedArraysBF(new int[]{0,0,0,0,0,0,0});
//        removesDupsSortedArraysBF(new int[]{0,0,1,1,2,2,3,3,4,5,5,6});
        removesDupsSortedArraysHMap(new int[]{0,0,1,1,2,2,3,3,4,5,5,6});
//        removesDupsSortedArraysHSet(new int[]{0,0,1,1,2,2,3,3,4,5,5,6});
        removesDupsSortedArraysHSet(new int[]{0,0,0,0,0,0,0});
//        removesDupsSortedArraysHSet(new int[]{});

    }

    public static void removesDupsSortedArraysBF(int[] arr){

        int[] res=new int[arr.length];

        if(arr.length <= 1){
            return;
        }

        int j=0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                res[j++]=arr[i];
            }
        }

        res[j++]=arr[arr.length-1];

        for(int i=0; i<j; i++){
            arr[i]=res[i];
        }
        System.out.print("The final values using BF are:  ");
        System.out.print("{ ");
        for(int i=0; i<j;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");

    }

    public static void removesDupsSortedArraysHMap(int[] arr){
        Map<Integer, Integer> map=new HashMap<>();
        for(int c: arr){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
        }

        System.out.println("The final values using MAP are: "+map.keySet());
    }

    public static void removesDupsSortedArraysHSet(int[] arr){
        Set<Integer> set=new HashSet<>();

        for(int i: arr){
            set.add(i);
        }

        System.out.println("The final values using SET are: "+set.toString());
    }
}
