package Arrays;

import java.util.*;

public class findMinEleinSortedRotatedArray {

    public static void main(String[] args) {
        int arr[]={16,19,21,25,3,5,8,10};
        System.out.println("The minimum ele in the given array "+ Arrays.toString(arr) +" is: "+ findMinEle(arr, 0, arr.length-1));
        System.out.println("The minimum ele in the given array "+ Arrays.toString(arr) +" is: "+ findMinEle(new int[]{2,1}, 0, arr.length-1));

        System.out.println("\n\n");
        minEle(arr);
        minEle(new int[]{2,1});

        System.out.println("\n\n");
        minEleSort(arr);
        minEleSort(new int[]{2,1});
    }

    public static int findMinEle(int[] arr, int low, int high){
        int mid;
        try{
            if(arr.length==0|| arr==null){
                System.out.println("Please enter the proper input");
            }else{
                while(low<high){
                    mid=low+((high-low)/2);

                    if(arr[mid]>arr[high]){
                        low=mid+1;
                    }else{
                        high=mid;
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            e.getCause();
            e.getMessage();
        }
        return arr[low];
    }


    public static void minEle(int[] arr){
        int len=arr.length;

        int minEle=Integer.MAX_VALUE;

        for(int i=0; i<len;i++){
            if(arr[i] < minEle){
                minEle=arr[i];
            }
        }

        System.out.println("The minELe is: "+ minEle);
    }

    public static void minEleSort(int[] arr){
        Arrays.sort(arr);
        System.out.println("The minEle in sort method: "+arr[0]);
    }
}
