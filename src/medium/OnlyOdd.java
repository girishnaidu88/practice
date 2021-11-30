package medium;

public class OnlyOdd {

    public static void main(String[] args) {
        int[] a = new int[]{1,3,52};
        System.out.println(isOddOnly(a));
    }

    public static boolean isOddOnly(int[] a){

        for(int i=0; i<a.length; i++){
            if(a[i]%2 ==0){
                return false;
            }
        }

        return true;
    }

}
