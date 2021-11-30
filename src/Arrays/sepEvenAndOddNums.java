package Arrays;

import java.util.*;

public class sepEvenAndOddNums {

    public static void main(String[] args) {
//        sepEvenAndOddNumsUsingBruteForce(new int[]{12, 17, 70, 15, 22, 65, 21, 90});
        sepEvenAndOddNumsUsingSameArray1(new int[]{12, 17, 70, 15, -15, 22, 65, 21, 90, -2});

//        if(Arrays.equals(sepEvenAndOddNumsUsingBruteForce(new int[]{12, 17, 70, 15, 22, 65, 21, 90}), sepEvenAndOddNumsUsingSameArray(new int[]{12, 17, 70, 15, 22, 65, 21, 90}))){
//            System.out.println("The sorted arrays by both the methods are same");
//        }else{
//            System.out.println("The sorted arrays by both the methods are not same");
//        }

    }

    public static int[] sepEvenAndOddNumsUsingBruteForce(int[] arr){
        int[] resArr = new int[arr.length];
        int count=0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]%2==0){
                resArr[count]=arr[i];
                count++;
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]%2!=0){
                resArr[count]=arr[j];
                count++;
            }
        }

        System.out.println("The separated array using extra array is: "+Arrays.toString(resArr));
        return resArr;
    }


    public static int[] sepEvenAndOddNumsUsingSameArray(int[] arr){
        int l=0, r=arr.length-1;

//        for(int i=0; i< arr.length; i++){
            while(l<r){
                if(arr[l]%2==0){
                    l++;
                }

                if(arr[r]%2==1){
                    r--;
                }

                if(l<r){
                    int temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                }
        }

        System.out.println("The separated array using same array is: "+Arrays.toString(arr));
        return arr;
    }

    public static int[] sepEvenAndOddNumsUsingSameArray1(int[] arr){
        int l=0, r=arr.length-1;

//        for(int i=0; i< arr.length; i++){
        while(l<r){

            if(arr[l]%2==0){
                l++;
            }

            if(arr[r]%2==1){
                r--;
            }

            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }

        System.out.println("The separated array using same array is: "+Arrays.toString(arr));
        return arr;
    }

}
