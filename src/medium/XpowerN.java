package medium;

public class XpowerN {

    public static void main(String[] args) {
        System.out.println(xpowN(4, 4));
        System.out.println(xpowN(2, -2));
        System.out.println(xpowN(-2, 2));
        System.out.println(xpowN(-2, -2));
        System.out.println(xpowN(2, 0));
        System.out.println(xpowN(2, 3));
    }

    public static double xpowN(double x, int n){

        if(n==0){
            return 1;
        }

        if(n<0){
            n=-n;
            x=1/x;
        }

        if(n%2==0){
            return xpowN(x*x, n/2);
        }else{
            return x*xpowN(x*x, n/2);
        }
    }

}
