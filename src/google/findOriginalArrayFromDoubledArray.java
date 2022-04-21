package google;

import java.util.*;

public class findOriginalArrayFromDoubledArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOriginalArray(new int[]{1,3,4,2,6,8})));
        System.out.println(Arrays.toString(findOriginalArray(new int[]{6,3,0,1})));
        System.out.println(Arrays.toString(findOriginalArray(new int[]{1,2,4,8})));
        System.out.println(Arrays.toString(findOriginalArray(new int[]{2,4,4,8})));
        System.out.println(Arrays.toString(findOriginalArray(new int[]{5,8,7,8,16,5,16,14,10,10})));

    }



    public static int[] findOriginalArray(int[] arr){
        int n = arr.length;
        if(n % 2 != 0)return new int[0];

        int[] res = new int[n/2];
        int idx = 0;

        Arrays.sort(arr);
        int j = n-1;
        Map<Integer,Integer> map = new HashMap<>();

        while(j >= 0){
            int element = arr[j];
            int twice = element * 2;

            if(map.containsKey(twice)){
                if(map.get(twice) == 1) {
                    map.remove(twice);
                }else {
                    map.put(twice, map.get(twice) - 1);
                }

                res[idx++] = element;
            }else{
                map.put(element,map.getOrDefault(element,0) + 1);
            }
            j--;
        }

        return idx == n/2 ? res : new int[0];
    }


    public static int[] findOriginalArray1(int[] A){

        int n=A.length, i=0;

        if(n%2==1){
            return new int[0];
        }
        Arrays.sort(A);

        int[] res=new int[n/2];

        Map<Integer, Integer> count = new HashMap<>();

        //Put alll the values into map
        for(int a: A){
            count.put(a, count.getOrDefault(a, 0)+1);
        }

        //Iterate through the map keySet to find the match and put it into the resultant array
        for(int x: count.keySet()){
            if(count.get(x) > count.getOrDefault(x+x, 0)){
                return new int[0];
            }

            for(int j=0; j< count.get(x); ++j){
                res[i++]=x;
                count.put(x+x, count.get(x+x)-1);
            }
        }

        return res;
    }
}
