package Arrays;

import java.util.Arrays;

public class pairWhoseSumCloseToZero {
    public static void main(String[] args) {
        int array[]={1,30,-5,70,-8,20,-40,60};
        findPairWithMinSumBruteForce(array);
        findPairWithMinSum(array);
    }

    public static void findPairWithMinSumBruteForce(int[] arr){

        if(arr.length<2){
            return;
        }

        int minSum=arr[0]+arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int tempSum=arr[i]+arr[j];

                if(Math.abs(tempSum) < Math.abs(minSum)){
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minSum=tempSum;
                }
            }
        }
        System.out.println("The pair whose sum is close to ZERO Using BruteForce is: "+ arr[pair1stIndex] +" and "+arr[pair2ndIndex]);
    }

    public static void findPairWithMinSum(int[] arr){
        int minSum=Integer.MAX_VALUE;
        System.out.println("The minSum: "+ minSum);
        Arrays.sort(arr);
        int minLeft=0, minRight=0;
        int n = arr.length;
        int l=0, r=n-1;
        int sum=0;

        if(n<2){
            return;
        }

        while(l < r){
            sum=arr[l]+arr[r];

            if(Math.abs(sum) < Math.abs(minSum)){
                minSum=sum;
                minLeft=l;
                minRight=r;
            }

            if(sum < 0){
                l++;
            }else{
                r--;
            }
        }
        System.out.println("The pair whose sum is close to ZERO Using logic is: "+ arr[minLeft] +" and "+arr[minRight]);
    }
}
