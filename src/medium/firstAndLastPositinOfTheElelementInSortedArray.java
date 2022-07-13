package medium;

public class firstAndLastPositinOfTheElelementInSortedArray {

    public static void main(String[] args) {

        firstAndLastPosition(new int[]{5,7,8,8,8,8,10}, 8);
        firstAndLastPosition(new int[]{5,7,8,8,8,8,10}, 7);
        firstAndLastPosition(new int[]{5,7,8,8,8,8,10}, 10);
        firstAndLastPosition(new int[]{5,7,8,8,8,8,10}, 1);
    }

    public static void firstAndLastPosition(int[] arr, int key){

        int first=-1, last=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=key){
                continue;
            }else{
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }

        System.out.println("The first occurance is: "+first+" the last occurance is: "+last);
    }


}
