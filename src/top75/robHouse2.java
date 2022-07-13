package top75;

public class robHouse2 {

    public static void main(String[] args) {
        System.out.println("The rob house 2: " + rob(new int[]{2, 3, 2}));
        System.out.println("The rob house 2: " + rob(new int[]{1, 2, 1, 2}));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int max1 = rob_simple(nums, 0, nums.length - 2);
        int max2 = rob_simple(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    public static int rob_simple(int[] nums, int start, int end) {
        int t1 = 0;
        int t2 = 0;

        for (int i = start; i <= end; i++) {
            int temp = t1;
            int current = nums[i];
            t1 = Math.max(current + t2, t1);
            t2 = temp;
        }

        return t1;
    }
}