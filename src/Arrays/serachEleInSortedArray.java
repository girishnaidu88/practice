package Arrays;

public class serachEleInSortedArray {

    public static void main(String[] args) {
        int[][] sortedMatrix =
                {
                        { -1, 6, 10, 12, 20 },
                        { 4, 8, 15, 22, 25 },
                        { 5, 20, 35, 37, 40 },
                        { 10, 28, 38, 45, 55 }
                };

        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, 55));

        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, -1));
//        System.out.println("Element found in matrix: "+searchElementInSortedMatrix(sortedMatrix, 54));

        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Element found: "+searchEleInSortedArr(arr, 5));
        System.out.println("Element found: "+searchEleInSortedArr(arr, 2));
        System.out.println("Element found: "+searchEleInSortedArr(arr, 4));
        System.out.println("Element found: "+searchEleInSortedArr(arr, 0));
    }

    public static boolean searchElementInSortedMatrix(int[][] arr, int key){
        int R= arr.length;
        int C=arr[0].length;
        int r=0, c=C-1;

        while(r < R && c>=0){

            if(key < arr[r][c]){
                c=c-1; // move left
            }else{
                r=r+1; // move down
            }

            if(arr[r][c]==key){
                System.out.println("The element "+key+" found: "+r +" and "+c);
                return true;
            }
        }
//        System.out.println("The Element not found");
        return false;
    }

    public static boolean searchEleInSortedArr(int[] arr, int ele){
        int l=0, r=arr.length-1;


        while(l < r){
            int mid=(l+r)/2;

            if(arr[mid]==ele){
//                System.out.println("Element found");
                return true;
            }

            if(ele < arr[mid]){
                r=mid;
            }

            if(ele > arr[mid]){
                l=mid+1;
            }
        }
        return false;
    }



}
