package medium;

public class regularExpMatching {

    public static void main(String[] args) {
        System.out.println("The give String and pattern matches: "+regXMatch("aabccd", "a?bc?d"));
    }

    public static boolean regXMatch(String s, String p){
        int i=0, j=0, starIndex=0, iIndex=0;

        while(i < s.length()){
            if(j < p.length() && p.charAt(j)=='?' || p.charAt(j) == s.charAt(i)){
                j++;
                i++;
            }else if(j < p.length() && p.charAt(j)=='*'){
                starIndex=j;
                iIndex=i;
                j++;
            }else if(starIndex != -1){
                j=starIndex+1;
                i=iIndex+1;
                iIndex++;
            }else{
                return false;
            }
        }

        return j == p.length();
    }

}
