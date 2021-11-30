package practice;

import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

//        System.out.println(bs(a, 0, a.length, 5));
//        int result= bs(a, 0, a.length, 5);
        int result= bs(a, 0, a.length, 2);
        if(result!=-1){
            System.out.println("The key found at position: "+result);
        }else{
            System.out.println("Key not found!!");
        }

    }public static int bs(int[] a, int low, int high, int key){
        Arrays.sort(a);
        int mid=(low+high)/2;

        while(low<=high){
            if(a[mid]<key){
                low=mid+1;
            }else if(a[mid]==key){
                return mid;
            }else{
                high = mid+1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            return -1;
        }

        return -1;
    }


}
