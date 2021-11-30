package medium;

public class leaderInArray {

    public static void main(String[] args) {
        findLeaderBruteForce(new int[]{14, 12, 70, 15, 99, 65, 21, 90, 1});
        findLeaderBruteForce1(new int[]{14, 12, 70, 15, 99, 65, 21, 90, 1});
    }


    public static void findLeaderBruteForce(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean isLeader=true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<=arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void findLeaderBruteForce1(int[] arr){
        int leader=arr[arr.length-1];
        System.out.print(leader+" ");

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.print(leader+ " ");
            }
        }
    }

}
