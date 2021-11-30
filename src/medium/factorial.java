package medium;

public class factorial {

    public static void main(String[] args) {
        System.out.println("The Factorial of the num is: "+factorialOfNum(9));
        System.out.println("The Factorial of the num is: "+factorialOfNum(0));
        System.out.println("The Factorial of the num is: "+factorialOfNum(1));
    }

    public static long factorialOfNum(int num){
        if(num==0|| num==1)
            return num;
        return (num * factorialOfNum(num-1));
    }

}
