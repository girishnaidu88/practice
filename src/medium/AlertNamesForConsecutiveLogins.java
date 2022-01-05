package medium;

import java.util.*;

public class AlertNamesForConsecutiveLogins {

    public static void main(String[] args) {
        String[] names={"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] times={"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};

        System.out.println(alertNames(names, times).toString());

        String[] names1={"alice","alice","alice","bob","bob","bob","bob"};
        String[] times1={"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};

        System.out.println(alertNames(names1, times1).toString());
    }

    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map=new HashMap<>();
        List<String> ans=new ArrayList<>();

        for(int i=0; i<keyName.length; i++){
            if(!map.containsKey(keyName[i])){
                map.put(keyName[i], new ArrayList<>());
            }

            String[] x=keyTime[i].split(":");
            int time=Integer.parseInt(x[0])*60+Integer.parseInt(x[1]);
            map.get(keyName[i]).add(time);
        }

        Set<String> keys=map.keySet();
        for(String s: keys){
            List<Integer> curr=map.get(s);
            for(int i=0; i<curr.size()-2; i++){
                int t1=curr.get(i), t2=curr.get(i+1), t3=curr.get(i+2);
                if(t2<=t1+60 && t3<=t1+60){
                    ans.add(s);
                    break;
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
