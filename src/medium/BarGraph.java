package medium;

public class BarGraph {

    public static void main(String[] args) {
        printGraph(new int[]{2, 1,5,3});
    }

    public static void printGraph(int[] arr){
        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }

        for(int floor=max; floor>=1; floor--){
            for(int j=0; j<arr.length; j++){
                if(arr[j] >= floor){
                    System.out.print("x\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
