package medium;

public class nthRootOfAnInteger {

    public static void main(String[] args) {
        nthRoot(27.0, 3);
        nthRoot(5, 2);

    }


    public static void nthRoot(double x, int n){

        double high, low;

        if(x>=0 && x<=1){
            low=x;
            high=1;
        }else{
            low=1;
            high=x;
        }

        double epsilon=0.00000001;

        double guess=(low+high)/2;

        while(Math.abs((Math.pow(guess, n))-x) >=epsilon){

            if(Math.pow(guess, n) >x ){
                high=guess;
            }else{
                low=guess;
            }
            guess=(low+high)/2;
        }

        System.out.println("The "+n+" root of "+x +" is : "+guess);
    }

}
