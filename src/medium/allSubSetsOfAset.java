package medium;

public class allSubSetsOfAset {

    public static void main(String[] args) {
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);
    }

    public static void printSubsets(char[] cSet){
        int n=cSet.length;

        for(int i=0; i< (1<<n); i++){
            System.out.print(" { ");

            for(int j=0; j<n; j++){

                if((i & (1<<j)) > 0){
                    System.out.print(cSet[j]+" ");
                }
            }
            System.out.println(" } ");
        }

    }

}
