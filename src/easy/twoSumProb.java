package easy;

import java.util.*;

public class twoSumProb {

    public static void main(String[] args) {
        twoSumBF(new int[]{2,4,3,1,-1,6}, 5);
        twoSumHMap(new int[]{2,4,3,1,-1,6}, 5);
        twoSumArraySort(new int[]{2,4,3,1,-1,6}, 5);

    }

    public static void twoSumBF(int[] arr, int target){

        int pair1stIndex=0, pair2ndIndex=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    System.out.println("The pair is equal to the target: "+target+ " is: 1st INDEX:-> "+pair1stIndex+" and value is: "+arr[i]+" || 2nd INDEX:-> "+pair2ndIndex+" and value is: "+arr[j]);
                }
            }
        }
    }

    public static void twoSumHMap(int[] arr, int target){
        Map<Integer, Integer> hMap= new HashMap<>();

        for(int val: arr){
            if(hMap.containsKey(val)){
                hMap.put(val, hMap.get(val)+1);
            }else{
                hMap.put(val, 1);
            }
        }
        System.out.println("This is Hmap --------------");
        for(int i=0; i<arr.length; i++){
            int sum=target-arr[i];
            if(hMap.containsKey(sum)){
                System.out.println("The pair is equal to the target: "+target+ " is: "+arr[i]+ " and "+sum);
            }
        }

    }

    public static void twoSumArraySort(int[] arr, int target){
        System.out.println(" ----------- This is with array sort method ----------- ");
        int pair1stIndex=0, pair2ndIndex=0;

        Arrays.sort(arr);
        int l=0, r=arr.length-1;

        int sum=arr[l]+arr[r];

        while(l<r){
            if(sum<target){
                l++;
            }

            if(sum>target){
                r--;
            }

            if(sum==target){
                System.out.println("The pair is equal to the target: "+target+ " is: "+arr[l]+ " and "+arr[r]);
                l++;
                r--;
            }
        }

    }

}
