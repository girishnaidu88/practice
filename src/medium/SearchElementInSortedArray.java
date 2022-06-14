package medium;

public class SearchElementInSortedArray {

    public static void main(String[] args) {
        System.out.println("The element is found: "+searchEleInSortedArray(new int[]{1,3,5,7,8,12,13,14,15,19}, 13));
        System.out.println("The element is found: "+searchEleInSortedArray(new int[]{1,3,5,7,8,12,13,14,15,19}, 1));
        System.out.println("The element is found: "+searchEleInSortedArray(new int[]{1,3,-5,7,8,12,13,14,15,19}, -5));
        System.out.println("The element is found: "+searchEleInSortedArray(new int[]{1,3,5,7,8,12,13,14,15,19}, 113));
    }

    public static boolean searchEleInSortedArray(int[] nums, int ele){
        int low=0, high=nums.length-1, mid;

        while(low < high){
            mid = (low+high)/2;

            if(nums[mid]== ele){
                return true;
            }

            if(ele < nums[mid]){
                high=mid;
            }

            if(ele > nums[mid]){
                low=mid+1;
            }
        }

        return false;
    }
}
