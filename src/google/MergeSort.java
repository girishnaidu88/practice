package google;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums={2,0,4,7,1,5,3};
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int l, int r){
        if(l<r){
            int mid=l+ (r-l)/2;

            sort(nums, l, mid);
            sort(nums, mid+1, r);
            merge(nums, l, mid, r);

        }
    }

    public static void merge(int[] nums, int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int[] la=new int[n1];
        int[] ra=new int[n2];

        for(int i=0; i<n1; i++){
            la[i]=nums[l+i];
        }

        for(int j=0; j<n2; j++){
            ra[j]=nums[mid+1+j];
        }

        int i=0, j=0;
        int k=l;

        while(i < n1 && j < n2){
            if(la[i]<=ra[j]){
                nums[k]=la[i];
                i++;
            }else{
                nums[k]=ra[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k]=la[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k]=ra[j];
            j++;
            k++;
        }

    }
}
