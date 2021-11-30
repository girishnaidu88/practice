package medium;

import java.util.*;

public class separate0sAnd1s {
    public static void main(String[] args) {
        sep0s1sUsingSort(new int[]{0,1,0,0,1,1,1,0,1});
        sep0s1sUsingExtraArr(new int[]{0,1,0,0,1,1,1,0,1});
        sep0s1sWOExtras(new int[]{0,1,0,0,1,1,1,0,1});

        if(Arrays.equals(sep0s1sUsingSort(new int[]{0,1,0,0,1,1,1,0,1}), sep0s1sUsingExtraArr(new int[]{0,1,0,0,1,1,1,0,1}))){
            System.out.println("The 2 arrays are equal");
        }else{
            System.out.println("Arrays not equal");
        }

        if(Arrays.equals(sep0s1sUsingSort(new int[]{0,1,0,0,1,1,1,0,1}), sep0s1sWOExtras(new int[]{0,1,0,0,1,1,1,0,1}))){
            System.out.println("The 2 arrays are equal");
        }else{
            System.out.println("Arrays not equal");
        }

    }

    public static int[] sep0s1sUsingSort(int[] arr){
        Arrays.sort(arr);
        System.out.println("The sorted array: "+Arrays.toString(arr));
        return arr;
    }

    public static int[] sep0s1sUsingExtraArr(int[] arr){
        int[] resultantArr=new int[arr.length];
        int j=0;
        for(int z: arr){
            if(z==0){
                resultantArr[j]=z;
                j++;
            }
        }

        for(int k=j; k<arr.length; k++){
            resultantArr[k]=1;
        }

        System.out.println("The sorted array using extra array: "+ Arrays.toString(resultantArr));
        return resultantArr;
    }

    public static int[] sep0s1sWOExtras(int[] arr){
        int l=0, r=arr.length-1;

        while(l < r){
            if(arr[l]==0){
                l++;
            }

            if(arr[r]==1){
                r--;
            }

            if(arr[l] > arr[r]){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }

        System.out.println("The sorted array WO extras: "+ Arrays.toString(arr));
        return arr;
    }

}
