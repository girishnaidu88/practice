package medium;

public class robHouse {

    public static void main(String[] args) {
        System.out.println("rob House: "+rob(new int[]{1,2,3,1}));
        System.out.println("rob House Optimized: "+robOptimized(new int[]{1,2,3,1}));
        System.out.println("rob House: "+rob(new int[]{3,2,7,9,3,1}));
        System.out.println("rob House Optimized: "+robOptimized(new int[]{2,2,7,9,3,1}));
    }

    public static int rob(int[] nums) {

        int N = nums.length;

        // Special handling for empty array case.
        if (N == 0) {
            return 0;
        }

        int[] maxRobbedAmount = new int[nums.length + 1];

        // Base case initializations.
        maxRobbedAmount[N] = 0;
        maxRobbedAmount[N - 1] = nums[N - 1];

        // DP table calculations.
        for (int i = N - 2; i >= 0; --i) {

            // Same as the recursive solution.
            maxRobbedAmount[i] = Math.max(maxRobbedAmount[i + 1], maxRobbedAmount[i + 2] + nums[i]);
        }

        return maxRobbedAmount[0];
    }


    //Optimized
    public static int robOptimized(int[] nums) {

        int N = nums.length;

        // Special handling for empty array case.
        if (N == 0) {
            return 0;
        }

        int robNext, robNextPlusOne;

        // Base case initializations.
        robNextPlusOne = 0;
        robNext= nums[N - 1];

        // DP table calculations. Note: we are not using any
        // table here for storing values. Just using two
        // variables will suffice.
        for (int i = N - 2; i >= 0; --i) {

            // Same as the recursive solution.
            int current = Math.max(robNext, robNextPlusOne + nums[i]);

            // Update the variables
            robNextPlusOne = robNext;
            robNext = current;
        }

        return robNext;
    }
}
