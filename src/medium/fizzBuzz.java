package medium;

import java.util.*;

public class fizzBuzz {

    public static void main(String[] args) {
        findFizzBuzz(new String[]{"1","2","3","4","5", "15"});
    }

    public static void findFizzBuzz(String[] arr){

        for(int i=0; i<arr.length;i++){
            if((Integer.valueOf(arr[i])%3==0) && (Integer.valueOf(arr[i])%5==0)){
                arr[i]="FizzBuzz";
            }else if((Integer.valueOf(arr[i]))%3==0){
                arr[i]="Fizz";
            }else if(Integer.valueOf(arr[i])%5==0){
                arr[i]="Buzz";
            }else{
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
