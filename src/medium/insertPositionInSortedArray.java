package medium;

public class insertPositionInSortedArray {
    public static void main(String[] args) {
        insertposition(new int[]{1, 3, 5, 6}, 3);
        insertposition(new int[]{1, 3, 5, 6}, 4);
        insertposition(new int[]{1, 3, 5, 6}, 2);
    }

    public static void insertposition(int[] arr, int key){

        int insertPos=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("The position is: "+i);
                return;
            }

            if(arr[i]>key){
                insertPos=Math.max(insertPos, i);
                break;
            }
        }
        System.out.println("The ele not found and can be inserted at position: "+insertPos);

    }

}
