package Arrays;

public class findTheMissingNumberInArray {

    public static void main(String[] args) {
        System.out.println("The missing number is:"+findMissingNumber(new int[]{1,2,5,4,6,7}));
        System.out.println("The missing number is:"+findMissingNumber(new int[]{5,3,1,2}));
    }

    public static int findMissingNumber(int[] a){
        int sum=0;
        for(int z: a){
            sum=sum+z;
        }
        System.out.println("The sum is: "+sum);

        int n=a.length+1;
        int num=((n*(n+1))/2);
        System.out.println("The num is: "+num);

        return num-sum;
    }
}
