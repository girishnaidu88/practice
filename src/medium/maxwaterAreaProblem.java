package medium;

public class maxwaterAreaProblem {

    public static void main(String[] args) {
        maxAreaOrWater(new int[]{1,8,6,2,5,4,8,3,7});
        maxAreaOrWater(new int[]{4,1,2,3,4});
        maxAreaOrWater(new int[]{1,2,1});
        maxAreaOrWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        maxAreaOrWater(new int[]{2, 0, 2});
        maxAreaOrWater(new int[]{3, 0, 2, 0, 4});
    }


    public static void maxAreaOrWater(int[] height){
        int l=0, r=height.length-1, maxArea=0;

        while(l < r){
            maxArea=Math.max(maxArea, Math.min(height[l], height[r]) *(r-l));

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        System.out.println("The maxArea or the maxWater can be stored is: "+ maxArea);

    }
}
