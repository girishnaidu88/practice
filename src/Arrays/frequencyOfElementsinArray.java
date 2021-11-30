package Arrays;

import java.util.*;

public class frequencyOfElementsinArray {

    public static void main(String[] args) {
        freqUsingHashMap(new int[]{1, 1, 1, 3, 3, 4, 5, 5, 6, 6});
    }

//    public static void freqUsingHashMap(int[] arr){
//        Map<Integer, Integer> hMap=new HashMap<>();
//
//        for(int i: arr){
//            if(hMap.containsKey(i)){
//                hMap.put(i, hMap.get(i)+1);
//            }else{
//                hMap.put(i, 1);
//            }
//        }
//
////        Iterator<Map.Entry<Integer, Integer>> it= hMap.entrySet().iterator();
////
////        while(it.hasNext()){
////            Map.Entry<Integer, Integer> map = it.next();
////            System.out.println(map.getKey()+"-->"+map.getValue());
////        }
//
//        for(Map.Entry<Integer, Integer> iter: hMap.entrySet()){
//            System.out.println(iter.getKey()+" --> "+iter.getValue());
//        }

    public static void freqUsingHashMap(int[] arr){
        Map<Integer, Integer> hMap= new HashMap<>();
        for(int i: arr){
            if(hMap.containsKey(i)){
                hMap.put(i, hMap.get(i)+1);
            }else{
                hMap.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> iter: hMap.entrySet()){
            System.out.println(iter.getKey()+" ---> "+iter.getValue());
        }







    }



}
