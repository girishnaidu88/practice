package medium;

public class divide2Integers {

    public static void main(String[] args) {
        divideIntegers(10, 3);
        divideIntegers(-9, 3);
        divideIntegers(7, -3);
        divideIntegers(19, 19);
        divideIntegers(19, 119);
        divideIntegers(0, 19);
        divideIntegers(19, 0);
    }

    public static void divideIntegers(int dividend, int divisor){

        int quotient=0;

        if(dividend==0){
            System.out.println("The dividend is zeor: "+quotient);
        }

        if(divisor==0){
            System.out.println("Divide by zero error");
            return;
        }

        int sign= ((dividend <0) || (divisor <0)) ? -1: 1;

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);



        while(dividend >= divisor){
            dividend=dividend-divisor;
            ++quotient;
        }

        if(sign==-1){
            quotient=-quotient;
        }

        System.out.println("The value is: "+quotient);

    }
}
