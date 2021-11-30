package medium;

public class swap2NumsWO3rdVar {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        swapWO3rdVar(a, b);
    }

    public static void swapWO3rdVar(int n, int m){
        System.out.println("The Original numbers are: a="+n+" b="+m);
            n=n+m;
            m=n-m;
            n=n-m;
        System.out.println("The Swaped numbers are: a="+n+" b="+m);
    }

}
