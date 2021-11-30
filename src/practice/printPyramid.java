package practice;

public class printPyramid {

    public static void main(String[] args) {
        int rows= 5;
        printThePyramid(rows);
        printCustomPyramid("lakshmi Vuppalapatti");
    }


    public static void printCustomPyramid(String custName){
        int rows=custName.length();

        for(int i=0; i<rows; i++){
            int noOfSpaces= rows-i;

            printString(" ", noOfSpaces);
            printString1(custName.charAt(i)+" ", i);
            System.out.println("");

        }
    }

    public static void printString1(String str, int times){
        for(int j=0; j<=times; j++){
            System.out.print(str);
        }
    }


    public static void printThePyramid(int rows){
        for(int i=1; i<=rows; i++){
            int noOfWhiteSpaces = rows-i;

            printString(" ", noOfWhiteSpaces);
            printString("* ", i);
            System.out.println("");
        }
    }

    public static void printString(String str, int times){
        for(int j=0; j<times; j++){
            System.out.print(str);
        }
    }




}
