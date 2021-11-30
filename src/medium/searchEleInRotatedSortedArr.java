package medium;

public class searchEleInRotatedSortedArr {

    public static void main(String[] args) {
        int arr[]={16,19,21,25,-1,3,5,8,10};
        System.out.println("The ele found: "+isEleFoundUsingLogic(arr, 3));
        System.out.println("The ele found: "+isEleFoundUsingLogic(arr, 13));
        System.out.println("The ele found: "+isEleFoundUsingLogic(arr, -1));
        System.out.println("The ele found: "+isEleFoundUsingLogic(arr, 10));
        System.out.println("+++++++++++++++++");
        System.out.println("The arr len: "+arr.length);
        System.out.println("The ele found using MS tech: "+isEleFoundUsingMergeSortTech(arr, 0, arr.length-1, 5));
        System.out.println("The ele found using MS tech: "+isEleFoundUsingMergeSortTech(arr, 0, arr.length-1, 55));
        System.out.println("The ele found using MS tech: "+isEleFoundUsingMergeSortTech(arr, 0, arr.length-1, -1));


    }

    public static boolean isEleFoundUsingLogic(int[] arr, int ele){
        boolean result=true;
        for(int i=0; i< arr.length; i++){
//            System.out.println("The index: "+i);
            if(ele==arr[i]){
//                System.out.println("The ele is: "+ele+" and the arr ele is: "+arr[i]);
                result=true;
                break;
            }else{
                result=false;
            }
        }
        return result;
    }


    public static boolean isEleFoundUsingMergeSortTech(int[] arr, int low, int high, int ele){
        boolean found=true;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==ele){
                found=true;
                return found;
            }

            //right part is sorted
            if(arr[mid]<=arr[high]){
                if(ele > arr[mid] && ele <=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }else{
                if(ele >= arr[low] && ele < arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }


        }

        found=false;
        return found;
    }
}
