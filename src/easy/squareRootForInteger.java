package easy;

public class squareRootForInteger {

    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(121));
        System.out.println(sqrt(11));
        squareRoot(144);
        squareRoot(172);
        squareRoot(9);
    }

    public static int sqrt(int num){

        int i=1, result=0;

        if(num==0 || num ==1){
            return num;
        }

        while(result<=num){
            i++;
            result=i*i;
        }

        return i-1;

    }


    public static void squareRoot(int num){
        int i=1; int result=0;

        while(result <=num){
            i++;
            result=i*i;
        }

        System.out.println("The squareRoot for the number: "+num+" is: "+(i-1));
    }
}
