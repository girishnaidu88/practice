package medium;

import java.util.*;

public class kthLargestElement {

    public static void main(String[] args) {
        int a[]=new int[]{3,5,12,78,34,56,1,};
        int k=3;
//        System.out.println("The original array is :"+ Arrays.toString(a)+" and the "+k+"th"+" largest element using arrays sort is: "+theKthLargestEleUsingArraySort(a, k));
        System.out.println("The original array is :"+ Arrays.toString(a)+" and the "+k+"th"+" largest element using PriorityQueue is: "+theKthLargestEleUsingArrayPriority(a, k));
    }


    public static int theKthLargestEleUsingArraySort(int[] a, int k){
        if(a ==null || a.length == 0 || k> a.length){
            System.out.println("Please provide the proper output");
            return -1;
        }else{
            Arrays.sort(a);
        }

        return a[a.length-k];
    }

    public static int theKthLargestEleUsingArrayPriority(int[] a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if(a ==null || a.length == 0 || k> a.length){
            System.out.println("Please provide the proper output");
            return -1;
        }else{
            for(int z: a){
                pq.add(z);

                if(pq.size() > k){
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}
