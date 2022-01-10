package medium;

import java.util.*;

public class GradeSegregation {

    public static void main(String[] args) {
        int[] grades = {90, 71, 89, 75, 83, 87, 81, 100, 99, 83,
                65, 100, 91, 78, 88, 62, 55, 84, 73, 89, 00, 20}; // 20 elements

        segGrade(grades);
    }

    public static void segGrade(int [] arr){

        int[] frequency=new int[11]; // 0-9, 10-19, 20-29,......,90-99,100;

        for(int i: arr){
            frequency[i/10]++;
        }

        System.out.println("Grade Selection:");
        for(int i=0; i<frequency.length; i++){
            if(i==10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }

            for(int stars=0; stars<frequency[i]; stars++){
                System.out.print("x ");
            }
            System.out.println();
        }

    }
}
