package medium;

public class stocksBuySell {

    public static void main(String[] args) {
        System.out.println(sellStock(new int[]{-14, -12, -70, -15, -99, -65, -21, -190}));
        System.out.println(sellStock(new int[]{14, 12, 70, 15, 99, 65, 21, 190}));
        System.out.println(sellStock(new int[]{7, 1, 5, 3, 6, 4}));
    }


    public static int sellStock(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice=prices[i];
            }else if((prices[i]-minPrice) > maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }

        return maxProfit;
    }








//    public static void sellStock(int[] arr){
//        int minpr=minPrice(arr);
//        int maxpr=maxPrice(arr);
//        System.out.println("The best Price to sell the Stock: "+minpr+" and "+maxpr+" the profit is: "+(maxpr-minpr));
//    }
//
//    public static int minPrice(int[] arr){
//        int minPrice=Integer.MAX_VALUE;
//        int minPriceIndex=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<minPrice){
//                minPrice=arr[i];
//                minPriceIndex=i;
//            }
//        }
//        System.out.println("The min price: "+ minPrice +" at Index: "+minPriceIndex);
//
//        return minPrice;
//    }
//
//    public static int maxPrice(int[] arr){
//        int maxPrice=Integer.MIN_VALUE;
//        int maxPriceIndex=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>maxPrice){
//                maxPrice=arr[i];
//                maxPriceIndex=i;
//            }
//        }
//        System.out.println("The max price: "+ maxPrice +" at Index: "+maxPriceIndex);
//
//        return maxPrice;
//    }
}
