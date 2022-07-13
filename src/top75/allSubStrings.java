package top75;

public class allSubStrings {
    public static void main(String[] args) {
        allSubStrings a=new allSubStrings();
        a.substrings("abc");
        a.substrings("abbc");
        a.substrings("a");
        a.substrings(" ");
        a.substrings("");
    }

    public void substrings(String str){
        for(int i=0; i<str.length();i++){
            for (int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
        System.out.println("++++++++++++++++++++++++");
    }
}
