package medium;

public class findMinimumInSortedArray {

    public static void main(String[] args){
        findMinSortedArray(new int[]{12, 13, 14,1,3,4});
    }

    public static void findMinSortedArray(int[] nums){
        int low=0, high=nums.length-1;
        int mid;
        while(low< high){
            mid=low+((high-low)/2);

            if(nums[mid] > nums[high] ){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        System.out.println(nums[low]);
    }
}
