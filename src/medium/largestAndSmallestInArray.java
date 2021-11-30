package medium;

import java.util.*;

public class largestAndSmallestInArray {

    public static void main(String[] args) {
        int[] a={2,32,4,5,67,44,3};
        findLargeAndSmallUsingArraySort(a);
        findLargeAndSmallUsingPriorityQueue(a);
        findLargeAndSmallUsinglogic(a);
    }

    public static void findLargeAndSmallUsingArraySort(int[] arr){
        System.out.println("The largest and smallest in given array Using sort is: ");
        Arrays.sort(arr);
        System.out.println("The smallest ele: "+arr[0]);
        System.out.println("The largest ele: "+arr[arr.length-1]);
    }

    public static void findLargeAndSmallUsingPriorityQueue(int[] arr){
        System.out.println("The largest and smallest in given array Using PriorityQueue is: ");
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i: arr){
            pq.add(i);
        }

        System.out.println("The smallest ele: "+pq.peek());
        while(pq.size()>1){
            pq.poll();
        }
        System.out.println("The largest ele: "+pq.peek());
    }

    public static void findLargeAndSmallUsinglogic(int[] arr){
        System.out.println("The largest and smallest in given array Using logic is: ");
        int smallest=arr[0];
        int largest=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest=arr[i];
            }
            if(arr[i] > largest){
                largest=arr[i];
            }
        }

        System.out.println("The smallest ele: "+smallest);
        System.out.println("The largest ele: "+largest);

    }

}
