package medium;

import java.util.*;

public class firstrepeatingEle {

    public static void main(String[] args) {
        findFirstRepeatingEleBF(new int[]{10, 7, 8, 1, 8, 7, 6});
        findAllRepeatingEleBF(new int[]{10, 7, 8, 1, 8, 7, 6});

        System.out.println("\n\n");
        findFirstRepeatingHmap(new int[]{10, 7, 8, 1, 8, 7, 6});
        findFirstRepeatingHmap(new int[]{10, 7, 8, 1, 8, 7, 6});

        System.out.println("\n\n");
        findAllRepeatingHmap(new int[]{10, 7, 8, 1, 8, 7, 6});
        findAllRepeatingHmap(new int[]{10, 7, 8, 1, 8, 7, 6});

//        findFirstRepeatingHmap(new int[]{10, 7, 8, 1, 8, 7, 6});
    }


    public static void findFirstRepeatingEleBF(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("The first repeating ele: "+arr[i]);
                    return;
                }
            }
        }
    }

    public static void findAllRepeatingEleBF(int[] arr){
        System.out.println("The repeating eles are: ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }

    public static void findFirstRepeatingHmap(int[] arr){
        Map<Integer, Integer> hMap= new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            if(hMap.containsKey(arr[i])){
                System.out.println("The first repeating character: "+arr[i]);
                return;
            }else{
                hMap.put(arr[i], 1);
            }
        }

    }

    public static void findAllRepeatingHmap(int[] arr){
        Map<Integer, Integer> hMap= new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            if(hMap.containsKey(arr[i])){
                hMap.put(arr[i], hMap.get(arr[i])+1);
            }else{
                hMap.put(arr[i], 1);
            }
        }

//        Iterator iter=hMap.entrySet().iterator();
        System.out.println("All the repeating values are: ");
        for(Map.Entry<Integer,Integer> iter: hMap.entrySet()){
            if(iter.getValue() > 1){
                System.out.print(iter.getKey()+" ");
            }
        }

    }
}
