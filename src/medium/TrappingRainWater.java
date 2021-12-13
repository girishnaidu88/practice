package medium;

public class TrappingRainWater {

    public static void main(String[] args) {
        trapRainWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        trapRainWater(new int[]{4,2,0,3,2,5});
    }


    public static void trapRainWater(int[] arr){
        int res=0;
        int n =arr.length;

        for(int i=1; i<n-1; i++){

            //find left max
            int left=arr[i];
            for(int j=0; j<i;j++){
                left= Math.max(left, arr[j]);
            }

            //find right max
            int right=arr[i];
            for(int j=i+1; j<n; j++){
                right= Math.max(right, arr[j]);
            }

            res=res+Math.min(left, right)-arr[i];
        }

        System.out.println("The rain water trapped is: "+res);
    }
}
