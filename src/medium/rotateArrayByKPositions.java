package medium;

import java.util.*;

public class rotateArrayByKPositions {
    public static void main(String[] args) {
        rotateByKpos(new int[]{1,2,3,4,5,6}, 9);
        rotateByKpos(new int[]{1,2,3,4,5,6}, 2);
        rotateByKpos(new int[]{1,2,3,4,5,6}, 5);
        rotateByKpos(new int[]{1,2}, 5);
        rotateByKpos(new int[]{1}, 5);

    }

    public static void rotateByKpos(int[] arr, int k){
        System.out.println("The Original array: "+Arrays.toString(arr));
        if(arr==null || arr.length<=1){
            System.out.println("Not proper data");
            return;
        }else{
            if(k>arr.length){
                System.out.print("Moding the K: ");
                k=k%arr.length;
                System.out.println(k);
            }
            for(int i=0; i<k; i++){
                for(int j=arr.length-1; j>0; j--){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println("The rotated array: "+Arrays.toString(arr));
    }
}
