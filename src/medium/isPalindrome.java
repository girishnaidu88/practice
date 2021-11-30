package medium;

public class isPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("ama"));
        System.out.println(isPalindrome("amMa"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
    }

    public static boolean isPalindrome(String text){
        boolean result=true;
        int len=text.length();

        if(len==0 || len==1){
            return result;
        }

        for(int i=0;i<=len/2; i++){
            if(text.charAt(i)!=text.charAt(len-1-i)){
                result= false;
                break;
            }
        }

        return result;
    }

}
