package medium;

import java.util.*;

public class medianFinder {

    /*Take two heaps

    1. maxHeap (Returns the largest number from the group)- stores all the
    numbers smaller than the median.
    2. minHeap (Returns the smallest number from the group) - stores all the
    numbers greater than the median.
    3. If the size of both heaps are equal then return the average of the
    largest number from the maxHeap and the smallest number from the minHeap.
    4. If size are not equal and minHeap has the size + 1 elements in it then
    transfer the smallest from that one to minHeap since it would become the
    largest and then the size would be equal so that we can take the average of
    both numbers.
    5. If the size is not greater by size + 1 then simply the minHeap element
    which is the largest is the median since there are total odd numbers
    present.

    */

    public static void main(String[] args) {
        System.out.println(findMedian());
        addNum(-1);
        addNum(2);
        System.out.println(findMedian());
        addNum(-3);
        System.out.println(findMedian());

    }

    static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap=new PriorityQueue<>();

    public static double findMedian(){
        if(maxHeap.size()==0 && minHeap.size()==0){
            return 0.0;
        }

        if(maxHeap.size() == minHeap.size()){
            return ((maxHeap.peek()+minHeap.peek())/2.0);
        }else{
            return maxHeap.peek();
        }
    }

    public static void addNum(int num){
        if(maxHeap.isEmpty() || maxHeap.peek() >=num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if(maxHeap.size() > minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }else if(maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }



}
