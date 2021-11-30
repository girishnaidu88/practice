package medium;

public class SumOfElementsInArray {

    public static void main(String[] args) {
        int[] a={33, -33, 1,2,3,-4, -8, 12};
        System.out.println(sumofArrayEle(a));
    }

    public static long sumofArrayEle(int[] a){
        long result=0;

        if(a.length==0){
            return result;
        }else if(a.length==1){
            return a[0];
        }else{
            for(int i=0; i<a.length; i++){
                result += a[i];
            }
        }

        return result;

    }

}
