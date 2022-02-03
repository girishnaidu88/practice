package medium;

public class CountBinary {

    public static void main(String[] args) {
        System.out.println(binaryCount("10101"));
        System.out.println(binaryCount("00110011"));
    }

    public static int binaryCount(String s){
        int ans=0, prev=0, curr=1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                ans=ans+Math.min(prev, curr);
                prev=curr;
                curr=1;
            }else{
                curr++;
            }
        }

        return ans+Math.min(prev, curr);

    }


}
