package easy;

import java.sql.*;
import java.util.*;

public class removeElement {

    public static void main(String[] args) {
        removeEle(new int[]{0,1,2,2,3,0,4,2}, 2);
        remove(new int[]{0,1,2,2,3,0,4,2}, 2);
    }

    public static void removeEle(int[] arr, int key){
        String[] res=new String[arr.length];

        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=key){
                res[j++]=String.valueOf(arr[i]);
            }
        }

        for(int i=j;i<res.length;i++){
            res[j++]="_";
        }

        System.out.println("The final array is: "+Arrays.toString(res));
    }

    public static void remove(int[] arr, int key){
        String[] res=new String[arr.length];

        int j=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]==key){
                res[j++]="_";
            }else{
                res[j++]=String.valueOf(arr[i]);
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
