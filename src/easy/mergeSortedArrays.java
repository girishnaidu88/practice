package easy;

public class mergeSortedArrays {

   public static void main(String[] args){
       int[] arr1= new int[]{1,3,5,7};
       int[] arr2=new int[]{2,4,6,8};
       int n1=arr1.length;
       int n2=arr2.length;

       int[] arr3=new int[n1+n2];

       mergesortArrays(arr1, arr2, n1, n2, arr3);
   }

   public static void mergesortArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){

       int i=0,j=0,k=0;

       while(i<n1 && j<n2){
           if(arr1[i]<arr2[j]){
               arr3[k++]=arr1[i++];
           }else{
               arr3[k++]=arr2[j++];
           }
       }

       while(i < n1){
           arr3[k++]=arr1[i++];
       }

       while(j<n2){
           arr3[k++]=arr2[j++];
       }

       for(int q=0; q<n1+n2; q++){
           System.out.print(arr3[q]+" ");
       }

   }

}
