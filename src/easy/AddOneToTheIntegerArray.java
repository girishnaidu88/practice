package easy;

import java.util.*;

public class AddOneToTheIntegerArray {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,8})));
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }

    public static int[] plusOne(int[] digits){
        int n =digits.length;

        for(int i=n-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }

            digits[i]=0;
        }

        int[] newNum=new int[n+1];
        newNum[0]=1;
//        System.out.println(Arrays.toString(digits));
        return newNum;
    }
}
