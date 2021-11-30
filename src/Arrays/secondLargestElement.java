package Arrays;

public class secondLargestElement {

    public static void main(String[] args) {
        System.out.println("The second largest element is: "+ secLargestEle(new int[]{2,13,24, 56, 35 ,356 , 46}));
        System.out.println("The second largest element is: "+ secLargestEle(new int[]{2,13,24, 566, 35 ,356 , 46}));
        System.out.println("The second largest element is: "+ secLargestEle(new int[]{2222,13,2444, 566, 35 ,356 , 46}));
    }

    public static int secLargestEle(int[] arr){
        int firstLargest= Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;

//        if(secLargest > firstLargest){
//            int temp=firstLargest;
//            firstLargest=secLargest;
//            secLargest=temp;
//        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secLargest=firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]> secLargest && arr[i] < firstLargest ){
                secLargest=arr[i];
            }
        }
//        System.out.println("The first: "+firstLargest);
//        System.out.println("The sec: "+secLargest);

        return secLargest;
    }

}
