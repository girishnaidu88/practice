package top75;

public class maxProductSubArray {

    public static void main(String[] args) {
        maxSubArrayProduct(new int[]{2,3,-2,4});
        maxSubArrayProduct(new int[]{2,4,0,-1});
    }

    public static void maxSubArrayProduct(int[] vals){
        int maxSofar = vals[0];
        int minSofar = vals[0];
        int result = 0;

        for(int i=1; i<vals.length; i++){
            int curr = vals[i];
            int tempMax = Math.max(curr, Math.max(maxSofar*curr, minSofar*curr));
            minSofar = Math.min(curr, Math.min(maxSofar*curr, minSofar*curr));

            maxSofar = tempMax;

            result=Math.max(maxSofar, result);
        }

        System.out.println("The max product is: "+ result);
    }

}
