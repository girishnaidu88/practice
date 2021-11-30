package easy;

public class climbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(0));
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int noOfStairs){

        if(noOfStairs==0 || noOfStairs==1 || noOfStairs==2)
            return noOfStairs;

        int oneStepBefore=2;
        int twoStepBefore=1;
        int always=0;

        for(int i=2; i<noOfStairs; i++){
            always=oneStepBefore+twoStepBefore;
            oneStepBefore=twoStepBefore;
            twoStepBefore=always;
        }

        return always;
    }

}
