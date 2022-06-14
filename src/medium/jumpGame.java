package medium;

public class jumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
        System.out.println(canJump(new int[]{1,1,1,1,1,0}));
        System.out.println(canJump(new int[]{0,1,1,1,1,1,0}));
        System.out.println(canJump(new int[]{-1,1,1,1,1,1,0}));
    }

    public static boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
