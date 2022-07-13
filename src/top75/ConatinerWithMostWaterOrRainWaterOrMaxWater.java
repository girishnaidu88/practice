package top75;

public class ConatinerWithMostWaterOrRainWaterOrMaxWater {

    public static void main(String[] args) {
        maxWater(new int[]{1,8,6,2,5,4,8,3,7});
//        maxWater(new int[]{4,1,2,3,4});
//        maxWater(new int[]{1,2,1});
//        maxWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
//        maxWater(new int[]{2, 0, 2});
//        maxWater(new int[]{3, 0, 2, 0, 4});
    }

    public static void maxWater(int[] height){
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The max area is : "+maxarea);
    }
}
