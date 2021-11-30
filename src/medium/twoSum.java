package medium;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        pair2SumBruteForce(new int[]{-40,-5,1,3,-2,6,7,8,20}, 4);
        pair2SumBruteForce(new int[]{-40,-5,1,3,6,7,8,20}, 4);
        pair2SumBruteForce(new int[]{-40,-5,1,3,6,7,8,20}, 5);
        System.out.println("___________________________________________");
        towSumPair(new int[]{-40,-5,1,3,6,7,8,20}, 4);
        towSumPair(new int[]{-40,-5,1,3,6,7,8,20}, -4);
        towSumPair(new int[]{-40,-5,1,3,6,7,8,20}, 5);
        System.out.println("___________________________________________");
        towSumPairHashMap(new int[]{-40,-5,1,3,6,7,8,20}, 4);
        towSumPairHashMap(new int[]{-40,-5,1,3,6,7,8,20}, -4);
        towSumPairHashMap(new int[]{-40,-5,1,3,6,7,8,20}, 5);
        System.out.println("___________________________________________");
        towSumPairHashMap(new int[]{-40}, 5);
        towSumPair(new int[]{1,3,4,2 }, 5);
        pair2SumBruteForce(new int[]{1, 4}, 51);

    }

    public static void pair2SumBruteForce(int[] arr, int target){
        int pair1stIndex=Integer.MIN_VALUE;
        int pair2ndIndex=Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("Please provide valid input");
        }else{
            for(int i=0; i<arr.length;i++){
                for(int j=i+1; j<arr.length;j++){
                    int sum=arr[i]+arr[j];
                    if(sum==target){
                        pair1stIndex=i;
                        pair2ndIndex=j;
                        System.out.println("The pair whose sum is equal to "+target+" is : " + arr[pair1stIndex]+ " && " + arr[pair2ndIndex]);
                    }
                }
            }
        }

        if(pair1stIndex != Integer.MIN_VALUE && pair2ndIndex != Integer.MIN_VALUE){
            System.out.println("The pair whose sum is equal to "+target+" is : " + arr[pair1stIndex]+ " && " + arr[pair2ndIndex]);
        }else{
            System.out.println("No pair found");
        }
    }

    public static void towSumPairHashMap(int[] arr, int target){


        Map<Integer, Integer> hMap= new HashMap<>();
        int pair1st=Integer.MIN_VALUE;
        int pair2nd=Integer.MIN_VALUE;
        boolean found=false;

        if(arr.length<2){
            System.out.println("Please provide valid input");
        }else{
            for(int z: arr){
                if(hMap.containsKey(z)){
                    hMap.put(z, hMap.get(z)+1);
                }else{
                    hMap.put(z, 1);
                }
            }

            for(int i=0; i<arr.length; i++){
                if(hMap.containsKey(target-arr[i])){
                    found=true;
                    pair1st=(target-arr[i]);
                    pair2nd=arr[i];
                    System.out.println("The pair that constitute the target "+ target +" is: "+ pair1st +" and "+pair2nd);
                    return;
                }else{
                    found=false;
                }
            }

            if(!found){
                System.out.println("No pairs found");
            }
        }

    }


    public static void towSumPair(int[] arr, int target){
        int i=0, j=0;
        int n=arr.length, l=0, r=n-1, minLeft=Integer.MIN_VALUE, minRight=Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("Please provide valid input");
        }else{
            Arrays.sort(arr);

            while(l < r){
                int sum=arr[l]+arr[r];

                if(sum==target){
                    minLeft=l;
                    minRight=r;
                }

                if(sum < target){
                    l++;
                }else{
                    r--;
                }

            }

            if(minLeft!=Integer.MIN_VALUE && minRight!=Integer.MIN_VALUE){
                System.out.println("The pair whose sum is equal to "+target+" is : " + arr[minLeft]+ " && " + arr[minRight]);
            }else{
                System.out.println("No pair found");
            }
        }
    }
}
