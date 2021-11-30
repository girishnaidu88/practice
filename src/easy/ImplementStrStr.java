package easy;

public class ImplementStrStr {

    public static void main(String[] args) {
        //haystack = "hello", needle = "ll"
//        strStr("hello", "ll");
        System.out.println("The position is: "+strStrBf("hello", "ll"));
        System.out.println("The position is: "+strStrBf("hello", "lo"));
        System.out.println("The position is: "+strStrBf("hello", "h"));
        System.out.println("The position is: "+strStrBf("hello", "o"));
        System.out.println("The position is: "+strStrBf("hello", "O"));
        System.out.println("The position is: "+strStrBf("hello", "ol"));
        System.out.println("The position is: "+strStrBf("hello", "hello"));
        System.out.println("The position is: "+strStrBf("hello", "hello1"));
    }

    public static void strStr(String haystack, String needle){
        int pos=haystack.indexOf(needle);
        System.out.println("The needle '"+needle+"' positing in the haystack '"+haystack+"' is: "+pos);
    }

    public static int strStrBf(String haystack, String needle){
        if(needle.length()==0){
            return 0;
        }

        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i=0; i<= haystack.length()-needle.length(); ++i){
            int j;
            for(j=0; j<needle.length(); ++j){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }

        return -1;
    }
}
