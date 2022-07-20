package medium;

public class HighProfitableMonthStockPrice {

    public static void main(String[] args) {
        int[] stockPrices={5, 3, 7, 1, 9};
        int k=3;

        System.out.println(findHighProfits(stockPrices, k));
        System.out.println(findHighProfits(new int[]{1,2,3,4,5,6}, 2));
    }

    public static int findHighProfits(int[] stockPrices, int k){
        int count=0;
        boolean flag=true;

        for(int i=0; i<stockPrices.length; i++){
            int temp=i+k-1;
            if(temp==stockPrices.length){
                break;
            }

            int max=stockPrices[i];
            flag=true;

            for(int j=i; j<i+k; j++){
                if((stockPrices[j] >= max)){
                    continue;
                }else{
                    flag=false;
//                    break;
                }
            }
            if(flag==true){
                count++;
            }

        }

        return count;
    }
}
