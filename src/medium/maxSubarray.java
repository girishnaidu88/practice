package medium;

public class maxSubarray {

    public static void main(String[] args) {
        maxSubarrayIter(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        maxSubarrayIter(new int[]{1,2,-2,1});
        maxSubarrayDP(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        maxSubarrayDP(new int[]{1,2,-2,1});
    }

    //Time: O(n2) and Space: O(1)
    public static void maxSubarrayIter(int[] vals){
        int maxSubarray = Integer.MIN_VALUE;

        for(int i=0; i<vals.length; i++){
            int currSubarray=0;
            for(int j=i; j<vals.length; j++){
                currSubarray += vals[j];
                maxSubarray = Math.max(currSubarray, maxSubarray);
            }
        }
        System.out.println("The max value is: "+ maxSubarray);
    }

    //Time: O(n) and Space: O(1)
    public static void maxSubarrayDP(int[] vals){
        int currSubarray = vals[0];
        int maxSubarray = vals[0];

        for(int i=1; i<vals.length; i++){
            int num=vals[i];
            currSubarray = Math.max(vals[i], currSubarray+num);
            maxSubarray=Math.max(currSubarray, maxSubarray);
        }
        System.out.println("Max val is: "+maxSubarray);
    }



}
