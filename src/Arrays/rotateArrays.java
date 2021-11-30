package Arrays;

public class rotateArrays {

    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5};
//        int order=2;

        //op: {4,5,1,2,3}

//        rotateArrayUsingIntermediaryArray(arr, order);
        bubbleRotate(arr, 2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        arrayReverseRotate(arr, 9);
    }

    public static void rotateArrayUsingIntermediaryArray(int[] arr, int order){
        if(order<=0 || arr==null){
            System.out.println("Please provide the proper input");
        }

        int[] resultantArray = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(order<arr.length) {
                resultantArray[i] = arr[order];
                order++;
            }
        }

        int j=0;
        for(int k=order; k<arr.length; k++){
            while(j<order){
                resultantArray[k]=arr[j];
                j++;
            }
        }

        System.out.println("The resultant array is: ");
        for(int z: resultantArray){
            System.out.print(z+" ");
        }
    }


    public static void bubbleRotate(int arr[], int order){
        if(arr ==null || arr.length == 1){
            System.out.println("No changes");
        }

        for(int i=0; i<=order; i++){
            for(int j=arr.length-1; j >0 ; j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }

        }

        System.out.print("{ ");
        for(int z: arr){
            System.out.print(z+", ");
        }
        System.out.print("}");
        System.out.println();

    }


    public static void arrayReverseRotate(int[] arr, int order){
        if(arr==null || arr.length==0 || order<0){
            System.out.println("Provide proper input");
        }

        if(order > arr.length){
            order=order%arr.length;
        }

        reverseRotate(arr, 0, order-1);
        reverseRotate(arr, order, arr.length-1);
        reverseRotate(arr, 0, arr.length-1);

        for(int z: arr){
            System.out.print(z+" ");
        }
    }

    public static void reverseRotate(int[] arr, int left, int right){
        if(arr==null || arr.length==1){
//            System.out.println("No changes the array remains same");
            return;
        }

        while(left <= right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }


}
