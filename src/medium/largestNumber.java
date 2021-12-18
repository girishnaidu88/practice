package medium;

import java.util.*;

public class largestNumber {



    public static void main(String[] args){
        int[] nums={10, 2};
        largestNumber ln=new largestNumber();
        System.out.println(ln.findLargest(nums));
        System.out.println(ln.findLargest(new int[]{3,30,34,5,9}));
        System.out.println(ln.findLargest(new int[]{1}));
        System.out.println(ln.findLargest(new int[]{100001, 9}));

    }

    class StringComparator implements Comparator<String>{
        public int compare(String a, String b){
            if(a.length()==b.length()){
                return b.compareTo(a);
            }else{
                String ab=a+b;
                String ba=b+a;

                return ba.compareTo(ab);
            }
        }
    }

    public String findLargest(int[] nums){
        StringBuffer sbuf=new StringBuffer();
        List<String> numsString=new ArrayList<>();

        for(int i: nums){
            numsString.add(String.valueOf(i));
        }

        Collections.sort(numsString, new StringComparator());

        for(String s: numsString){
            sbuf.append(s);
        }

        String res=sbuf.toString();

        if(res.length() > 0 && (res.charAt(0)=='0')){
            return "0";
        }

        return res;
    }

}
