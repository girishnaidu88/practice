package medium;

import java.util.*;

/*
You are in charge of a display advertising program. Your ads are displayed on websites all over the internet. You have some CSV input data that counts how many times that users have clicked on an ad on each individual domain. Every line consists of a click count and a domain name, like this:

counts = [ "900,google.com",
     "60,mail.yahoo.com",
     "10,mobile.sports.yahoo.com",
     "40,sports.yahoo.com",
     "300,yahoo.com",
     "10,stackoverflow.com",
     "20,overflow.com",
     "5,com.com",
     "2,en.wikipedia.org",
     "1,m.wikipedia.org",
     "1,mobile.sports",
     "1,google.co.uk"]

Write a function that takes this input as a parameter and returns a data structure containing the number of clicks that were recorded on each domain AND each subdomain under it. For example, a click on "mail.yahoo.com" counts toward the totals for "mail.yahoo.com", "yahoo.com", and "com". (Subdomains are added to the left of their parent domain. So "mail" and "mail.yahoo" are not valid domains. Note that "mobile.sports" appears as a separate domain near the bottom of the input.)

Sample output (in any order/format):

calculateClicksByDomain(counts) =>
com:                     1345
google.com:              900
stackoverflow.com:       10
overflow.com:            20
yahoo.com:               410
mail.yahoo.com:          60
mobile.sports.yahoo.com: 10
sports.yahoo.com:        50
com.com:                 5
org:                     3
wikipedia.org:           3
en.wikipedia.org:        2
m.wikipedia.org:         1
mobile.sports:           1
sports:                  1
uk:                      1
co.uk:                   1
google.co.uk:            1

n: number of domains in the input
(individual domains and subdomains have a constant upper length)
*/


public class domainCount {
    public static void main(String[] args) {
        String[] counts = {
                "900,google.com",
                "60,mail.yahoo.com",
                "10,mobile.sports.yahoo.com",
                "300,yahoo.com",
                "40,sports.yahoo.com",
                "10,stackoverflow.com",
                "20,overflow.com",
                "5,com.com",
                "2,en.wikipedia.org",
                "1,m.wikipedia.org",
                "1,mobile.sports",
                "1,google.co.uk"


        };

        Map<String, Integer> resMap1=domainAndCount(counts);

        for(Map.Entry<String, Integer> iter: resMap1.entrySet()){
            System.out.println(iter.getKey()+" ---> "+iter.getValue());
        }

    }




    public static Map<String, Integer> domainAndCount(String[] counts){
        Map<String, Integer> map=new HashMap<>();

        for(String str: counts){
            String[] domainClick= str.split(",");
            int count=Integer.valueOf(domainClick[0]);

            String[] domains=domainClick[1].split("\\.");

            for(int i=0; i<domains.length; i++){
                StringBuilder sb=new StringBuilder();
                sb.append(domains[i]);

                for(int j=i+1; j<domains.length;j++){
                    sb.append(".").append(domains[j]);
                }
                String domain=sb.toString();
//                map.put(domain, map.getOrDefault(domain, 0)+count);
                if(!map.containsKey(domain)){
                   map.put(domain, count);
                }else{
                    map.put(domain, map.get(domain)+count);
                }
            }
        }

//        for(Map.Entry<String, Integer> iter: map.entrySet()){
//            System.out.println(iter.getKey()+":"+iter.getValue());
//        }

        return map;
    }


    /* public static Map<String, Integer> readcount(String[] counts){

      Map<String, Integer> countMap=new HashMap<>();

      if(counts.length==0){
        return countMap;
      }

      for(int i=0; i<counts.length; i++){
        String[] tempArr=counts[i].split(",");
        String[] strArr=tempArr[1].split("\\.");

        System.out.println(Arrays.toString(strArr));

        for(int j=0; j<strArr.length; j++){
          StringBuilder sb = new StringBuilder();
//           String sb="";
          System.out.println(strArr[j]);
          sb=sb.append(strArr[j]);
          System.out.println("Here:" +sb);

          if(countMap.containsKey(sb.toString())){
            System.out.println("Inside 1");
            countMap.put(sb.toString(), countMap.get(sb.toString())+Integer.valueOf(tempArr[0]));
          }else{
            System.out.println("Inside 2");
            countMap.put(sb.toString(), Integer.valueOf(tempArr[0]));
          }

        }

      }
      System.out.println(countMap.toString());
      return countMap;
    } */


}

