package medium;

public class wildCardMatching {

    public static void main(String[] args) {
        System.out.println("This wilcard matching is proper: "+ isMatching("aaaaaaaaaaaaaaab", "*c"));
    }

    // aab ?ab
    // aab *ab

    public static boolean isMatching(String word, String pattern){
        int i=0, j=0;
        int starIndex=-1, iIndex=-1;

        while(i < word.length()){
            if(j < pattern.length() && pattern.charAt(j)=='?' || pattern.charAt(j) == word.charAt(i)){
                i++;
                j++;
            }else if(j < pattern.length() && pattern.charAt(j)=='*'){
                starIndex=j;
                iIndex=i;
                j++;
            }else if(starIndex != -1){
                j= starIndex+1;
                i=iIndex+1;
                iIndex++;
            }else{
                return false;
            }
        }

        while(j < pattern.length() && pattern.charAt(j)=='*'){
            ++j;
        }
        return j == pattern.length();
    }

}
