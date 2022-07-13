package medium;

//import java.lang.A;
import java.util.*;

public class maxSlidingWindow {

    public static void main(String[] args) {

            slidingWindow(new int[]{2,6,-1,2,4,1,-6,5}, 3);
            System.out.println("\n");
    }

    public static void slidingWindow(int[] a, int k){
        int n=a.length;
        int[] r=new int[n-k+1];
        int ri=0;

        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0; i<a.length; i++){
            if(!q.isEmpty() && q.peek() == i-k){
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()] < a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>= k-1){
                r[ri++]=a[q.peek()];
            }
        }
        System.out.println(Arrays.toString(r));
    }
}
