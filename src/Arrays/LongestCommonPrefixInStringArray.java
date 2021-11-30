package Arrays;

public class LongestCommonPrefixInStringArray {

    public static void main(String[] args)
    {
        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String longestPrefix=getLongestCommonPrefix(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
        System.out.println("\n"+"\n");
        longestPrefix=getLongestCommonPrefix(new String[]{"bsqlblog","sql2world","sqlquery","sqlproc"} );
        System.out.println("Longest Prefix : "+longestPrefix);
    }

    public static String getLongestCommonPrefix(String[] strArr){

        if(strArr.length==0){
            return "";
        }

        String minStr=getMinStr(strArr);

        int minStringPrefix=minStr.length();

        for(int i=0; i<strArr.length; i++){
            int j;
            for(j=0; j<minStringPrefix; j++){
                if(minStr.charAt(j)!=strArr[i].charAt(j)){
                    break;
                }
            }
            if(j<minStringPrefix){
                minStringPrefix=j;
            }
        }

        return minStr.substring(0, minStringPrefix);
    }

    public static String getMinStr(String[] strArray){
        String minString=strArray[0];

        for(int i=1; i<strArray.length; i++){
            if(strArray[i].length()<minString.length()){
                minString=strArray[i];
            }
        }

        System.out.println("The minString from the given array is: "+minString);
        return minString;
    }
}
