package medium;

public class Fibonacci {


    public static void main(String[] args) {
        int n = 10;
//        fib(n);
//        System.out.println(fibDP(n));
        fibonacci(n);
    }

    public static void fib(int n) {
        int a = 0, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " , ");
            a = b;
            b = c;
            c = a + b;
            System.out.print(b +", "+c+", ");
        }

        System.out.println();
    }

    public static int fibDP(int n) {

        int num=0;
        if (n ==0)
            return n;
        if(n==1)
            return n;

        for(int i=2; i<=n; i++)
            num= fibDP(n - 1) + fibDP(n - 2);

        return num;

    }

    public static void fibonacci(int n){
        int num1=0; int num2=1;
        int counter=0;

        while(counter < n){
            System.out.print(num1+" ");

            int num3=num1+num2;
            num1=num2;
            num2=num3;
            counter++;
        }
    }

}
