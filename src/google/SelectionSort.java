package google;

import java.util.*;

public class SelectionSort {

    //Complexities:
    //Time: O(n2)
    //Space: O(1)

    public static void main(String[] args) {
        int[] numbersToSort =new int[]{3,2,6,1,5,4};
        selSort(numbersToSort);
    }

    public static void selSort(int[] numbersToSort){
        System.out.println(Arrays.toString(numbersToSort));
        for(int i=0 ; i<numbersToSort.length-1; i++){
            int iMin=i;

            for(int j=i+1; j< numbersToSort.length; j++){
                if(numbersToSort[j]<numbersToSort[iMin]){
                    iMin=j;
                }
                int temp=numbersToSort[i];
                numbersToSort[i]=numbersToSort[iMin];
                numbersToSort[iMin]=temp;
            }
        }

        System.out.println(Arrays.toString(numbersToSort));

//        for(int i=0; i<numbersToSort.length; i++){
//            System.out.print(numbersToSort[i]+" ");
//        }
    }
}
