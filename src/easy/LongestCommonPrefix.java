package easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        longestPrefix(new String[]{"flower","flow","flight"});
        longestPrefix(new String[]{"flower","flowerlights","flowerfull"});
        longestPrefix(new String[]{"flower","fglowerlights","flowerfull"});
        longestPrefix(new String[]{"flower","glowerlights","flowerfull"});
    }

    public static void longestPrefix(String[] str){

        String pre=str[0];
        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(pre) !=0){
                pre= pre.substring(0, pre.length()-1);
            }
        }
        if(pre.length()==0){
            System.out.println("No common prefix with the given inputs");
        }else {
            System.out.println("The longes prefix is: " + pre + " and the length is: " + pre.length());
        }
    }
}
