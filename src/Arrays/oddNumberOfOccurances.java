package Arrays;

import java.util.*;

public class oddNumberOfOccurances {

    public static void main(String[] args) {
//        int arr[] = new int[]{20, 40, 50, 40, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("The number which has odd no.of occurances using HashMap is: "+Arrays.toString(oddOccuranceUsingHashMap(new int[]{20, 40, 50, 40, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20})));
        System.out.println("The number which has odd no.of occurances using HashMap is: "+Arrays.toString(oddOccuranceUsingHashMap(new int[]{20, 40, 50, 30, 10})));

        System.out.println("????????????????/");
        System.out.println();
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n");


        System.out.println("The number which has odd no.of occurances Using XOR is: "+Arrays.toString(oddOccuranceUsingXOR(new int[]{20, 40, 50, 40, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20})));
        System.out.println("The number which has odd no.of occurances Using XOR is: "+Arrays.toString(oddOccuranceUsingXOR(new int[]{20, 40, 50, 30, 10})));


//        System.out.println("The number which has odd no.of occurances Using XOR is: "+Arrays.toString(oddOccuranceUsingHashMap(new int[]{20, 40, 50, 30, 10})));
    }

    public static int[] oddOccuranceUsingHashMap(int[] arr){
        int[] result=new int[arr.length];
        Map<Integer, Integer> hMap = new HashMap<>();

        for(int i: arr){
           if(hMap.containsKey(i)){
               hMap.put(i, hMap.get(i)+1);
           }else{
               hMap.put(i, 1);
           }
        }

        // Iterator
        Iterator<Map.Entry<Integer, Integer>> new_Iterator
                = hMap.entrySet().iterator();

        // Iterating every set of entry in the HashMap
        int i=0;
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, Integer> new_Map
                    = (Map.Entry<Integer, Integer>)
                    new_Iterator.next();

            // Displaying HashMap
//            System.out.println(new_Map.getKey() + " = "new_Map.getValue());

            if(new_Map.getValue()%2!=0){
                System.out.println("The row: "+new_Map.getKey()+" --> "+new_Map.getValue());
                result[i]=new_Map.getKey();
                i++;
            }
        }

        return result;

    }

    public static int[] oddOccuranceUsingXOR(int[] arr){
        int[] resArr=new int[arr.length];
        int result=0, j=0;
        for(int i=0; i< arr.length; i++){
            result= result ^ arr[i];
            resArr[j++]=result;
        }

        return resArr;
    }
}
