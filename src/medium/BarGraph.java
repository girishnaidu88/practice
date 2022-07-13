package medium;

public class BarGraph {

    public static void main(String[] args) {
        printGraph(new int[]{2, -1,5,-3});
    }

    public static void printGraph(int[] arr){
        int max=arr[0];
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i]<min){
               min=arr[i];
            }
        }

        for(int floor=max; floor>=min; floor--){
            System.out.print(floor+"\t");
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
