package medium;

public class regexMatching {

    public static void main(String[] args) {
        System.out.println("The String and pattern is matching: "+isMatching("aabaaaaac", "*?*b*c"));
    }

    public static boolean isMatching(String s, String p){
        int i=0, j=0;
        int starIndex=-1, iIndex=-1;

        while(i < s.length()){
            if(j < p.length() && p.charAt(j)=='?' || p.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }else if(j < p.length() && p.charAt(j)=='*'){
                starIndex=j;
                iIndex=i;
                j++;
            }else if(starIndex!= -1){
                j=starIndex+1;
                i=iIndex+1;
                iIndex++;
            }else{
                return false;
            }
        }

        while(j < p.length() && p.charAt(j)=='*'){
            ++j;
        }

        return j == p.length();
    }

}
