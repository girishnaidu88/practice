package medium;

public class jumpsProb {

    public static void main(String[] args) {
        System.out.println("The no.of jumps: "+ noOfJumps(new int[]{2,3,1,1,4}));
        System.out.println("The no.of jumps: "+ noOfJumps(new int[]{2,3,0,0,0,4}));
    }

    public static int noOfJumps(int[] arr){
        int jumps=0, curEnd=0, curFarthest=0;

        for(int i=0; i<arr.length-1; i++){
            curFarthest=Math.max(curFarthest, i+arr[i]);

            if(i==curEnd){
                jumps++;
                curEnd=curFarthest;
            }
        }

        return jumps;
    }
}
