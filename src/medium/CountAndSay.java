package medium;

import java.util.*;


public class CountAndSay {

    public static void main(String[] args){
        countNsay(1223333445);
    }

    public static void countNsay(int num){
        Map<Integer, Integer> map=new HashMap();
        int rem=0;
        StringBuffer sb= new StringBuffer();

        while(num>0){
            rem=num%10;
            num=num/10;
            if(map.containsKey(rem)){
                map.put(rem, map.get(rem)+1);
            }else{
                map.put(rem, 1);
            }
        }

        System.out.println("The key set: "+map.keySet());
        System.out.println("The Value set: "+map.values());

        for(Map.Entry<Integer, Integer> iter: map.entrySet()){
            sb.append(iter.getValue()).append(iter.getKey());
            System.out.print(iter.getValue()+""+iter.getKey());
        }
        System.out.println();
        System.out.println("The final num is: "+ Integer.valueOf(sb.toString()));
    }
}
