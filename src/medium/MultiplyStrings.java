package medium;

import java.util.*;

public class MultiplyStrings {


    public static void main(String[] args) {
        System.out.println("The mul value is: "+strMultiply("12","12"));
        System.out.println("The mul value is: "+mulString("03","13"));
        System.out.println("The mul value is: "+mulString("03","00"));
        System.out.println("The mul value is: "+mulString("00","13"));
        System.out.println("The mul value is: "+mulString("01","13"));
        mulStrInbuiltFunc("01","13");
        mulStrInbuiltFunc("11","13");
    }

    public static String strMultiply(String num1, String num2){

        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }

        int[] ans= new int[num1.length()+num2.length()-1];

        for(int i=0; i<num1.length();i++){
            for(int j=0; j< num2.length(); j++){
                ans[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        System.out.println("The ans value is: "+Arrays.toString(ans));

        for(int i=ans.length-1; i>0; i--){
            ans[i-1] += ans[i]/10;
            ans[i]%=10;
        }
        System.out.println("The ans value after is: "+Arrays.toString(ans));

        StringBuffer sb= new StringBuffer();
        for(int i: ans){
            sb.append(i);
        }
        System.out.println("The ans sb value: "+ sb.toString());

        return sb.toString();

    }



    public static String mulString(String str, String str1){
        StringBuffer sb = new StringBuffer();

        int[] ans=new int[str.length()+str1.length() -1];

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str1.length(); j++){
                ans[i+j]= ans[i+j]+(str.charAt(i)-'0')*(str1.charAt(j)-'0');
            }
        }

        for(int i=ans.length-1; i>0; i--){
            ans[i-1]=ans[i-1]+ans[i]/10;
            ans[i]=ans[i]%10;
        }

        for(int i: ans){
            sb.append(i);
        }

        return sb.toString();
    }



    public static void mulStrInbuiltFunc(String str1, String str2){
        System.out.println("The mul val using inbuilt func is: "+(Integer.valueOf(str1)*Integer.valueOf(str2)));
    }

}
