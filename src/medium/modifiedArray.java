package medium;

import java.util.*;

public class modifiedArray {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(modifyArr(5, new int[][]{{1,3,2},{2,4,3},{0,2,-2}})));
        System.out.println(Arrays.toString(modifyArr(10, new int[][]{{2,4,6},{5,6,8},{1,9,-4}})));
        System.out.println(Arrays.toString(modifyArr(10, new int[][]{{0,9,1},{5,6,1},{8,9,1}})));

    }


    public static int[] modifyArr(int length, int[][] updates){
        int[] modifiedArr=new int[length];

        for(int i=0; i<updates.length; i++){
            doIncrements(modifiedArr, updates[i]);
        }

        return modifiedArr;
    }

    public static int[] doIncrements(int[] modifiedArr, int[] updates){

        for(int i=updates[0]; i<=updates[1];i++){
            modifiedArr[i] += updates[2];
        }

        return modifiedArr;
    }


}
