package medium;

import java.util.*;

public class AdsConversionRateOrPurchasesCount {

    public static void main(String[] args) {

        String[] completed_purchase_user_ids = {"3123122444","234111110", "8321125440", "99911063"};

        String[] ad_clicks = {
                "122.121.0.1,2016-11-03 11:41:19,Buy wool coats for your pets",
                "96.3.199.11,2016-10-15 20:18:31,2017 Pet Mittens",
                "122.121.0.250,2016-11-01 06:13:13,The Best Hollywood Coats",
                "82.1.106.8,2016-11-12 23:05:14,Buy wool coats for your pets",
                "92.130.6.144,2017-01-01 03:18:55,Buy wool coats for your pets",
                "122.121.0.155,2017-01-01 03:18:55,Buy wool coats for your pets",
                "92.130.6.145,2017-01-01 03:18:55,2017 Pet Mittens"};

        //The client also sent over the IP addresses of all their users.

        String[] all_user_ips = {
                "2339985511,122.121.0.155",
                "234111110,122.121.0.1",
                "3123122444,92.130.6.145",
                "39471289472,2001:0db8:ac10:fe01:0000:0000:0000:0000",
                "8321125440,82.1.106.8",
                "99911063,92.130.6.144"};

        List<String> result= findPurchases(completed_purchase_user_ids, ad_clicks, all_user_ips);
        System.out.println("The output: "+result);
    }

    public static List<String> findPurchases(String[] completeUserIds, String[] adClicks, String[] allUserIps) {
        Map<String,Integer> adClickMap = new HashMap<>();
        Map<String,String> IpUserMap = new HashMap<>();
        Map<String,Integer> adPurchaseCount = new HashMap<>();
        Set<String> purchased = new HashSet<>(Arrays.asList(completeUserIds));

        // put in the mapping only if user has purchased something
        for(String ipUser : allUserIps){
            String[] raw =ipUser.split(",");
            if(purchased.contains(raw[0])){
                IpUserMap.put(raw[1],raw[0]);
            }
        }

        //compute maps for ad clicks count and ad purchased count using the map above
        for(String adClick : adClicks){
            String[] raw=adClick.split(",");
            int count =adClickMap.getOrDefault(raw[2],0);

            adClickMap.put(raw[2],count + 1);
            if(IpUserMap.containsKey(raw[0])){
                int purchase = adPurchaseCount.getOrDefault(raw[2],0);
                adPurchaseCount.put(raw[2],purchase + 1);
            }
        }

        //use the computed map from above to generate the result
        List<String> res = new ArrayList<>();
        for(String ad: adClickMap.keySet()){
            StringBuilder sb = new StringBuilder();
            int purchases = adPurchaseCount.getOrDefault(ad,0);
            int clicks = adClickMap.get(ad);
            sb.append(purchases).append(" of ").append(clicks).append(" ").append(ad);
            res.add(sb.toString());
        }

        return res;
    }
}
