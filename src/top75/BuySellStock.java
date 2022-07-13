package top75;

public class BuySellStock {

    public static void main(String[] args){
        System.out.println(stockBuySell2Pass(new int[]{-14, 12, -70, -15, -99, -65, -21, -190}));
        System.out.println(stockBuySell(new int[]{-14, 12, -70, -15, -99, -65, -21, -190}));
        System.out.println(stockBuySell(new int[]{14, 12, 70, 15, 99, 65, 21, 190}));
        System.out.println(stockBuySell2Pass(new int[]{14, 12, 70, 15, 99, 65, 21, 190}));
        System.out.println(stockBuySell(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("The maxProfit is: "+stockBuySell2Pass(new int[]{7, 1, 5, 3, 6, 4}));
    }

    //Time: O(n) and Space: O(1)
    public static int stockBuySell(int[] prices){
        int minPrize=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrize){
                minPrize=prices[i];
            }else if((prices[i]-minPrize) > maxProfit) {
                maxProfit = (prices[i] - minPrize);
            }
        }
//        System.out.println("The min Price is: "+ minPrize + " and the max profit is on: "+ maxProfit);
        return maxProfit;
    }


    //Time: O(n2) and Space: O(1)
    public static int stockBuySell2Pass(int[] prices){
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j< prices.length; j++){
                int profit=prices[j]-prices[i];
                if(profit > maxProfit){
                    maxProfit=profit;
                }
            }
        }

        return maxProfit;
    }


}
