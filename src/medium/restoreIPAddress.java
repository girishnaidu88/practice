package medium;

import java.util.*;

public class restoreIPAddress {

    public static void main(String[] args) {
        String ip="25525511135";
        List<String> solutions=new ArrayList<String>();
        int idx=0;
        int count=0;
        String restore="";
        restoreIp(ip, solutions, idx, restore, count);

        System.out.println(solutions.toString());
    }

    public static void restoreIp(String ip, List<String> solutions, int idx, String restored, int count){
        if(count>4)
            return;

        if(count==4 && idx == ip.length())
            solutions.add(restored);

        for(int i=1; i<4; i++){
            if(idx+1> ip.length())
                break;

            String s=ip.substring(idx, idx+1);

            if((s.startsWith("0") && s.length() > 1) || (i==3 && Integer.parseInt(s) >=256 ))
                continue;

            restoreIp(ip, solutions, idx+1, restored+s+(count==3?"":"."), count+1 );
        }


    }
}
