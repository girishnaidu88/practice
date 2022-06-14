package medium;

public class searchElementinRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(searchEleRotatedSortedArr(new int[]{7,8,9,1,2,3,4,5}, 4));
        System.out.println(searchEleRotatedSortedArr(new int[]{7,8,9,1,2,3,4,5}, 1));
        System.out.println(searchEleRotatedSortedArr(new int[]{7,8,9,1,2,3,4,5}, 8));
        System.out.println(searchEleRotatedSortedArr(new int[]{7,8,9,1,2,3,4,5}, -4));
    }

    public static boolean searchEleRotatedSortedArr(int[] arr, int ele){
        int low=0, high=arr.length-1, mid;

        while(low < high){
            mid= (low+high)/2;

            if(arr[mid] == ele){
                return true;
            }

            if(arr[mid] < arr[high] ){
                if((ele > arr[mid]) && (ele <= arr[high] )){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }else{
                if((ele < arr[mid]) && (ele >= arr[low])){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }

        return false;
    }
}
