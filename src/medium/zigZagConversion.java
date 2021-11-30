package medium;

import java.util.*;

public class zigZagConversion {

    public static void main(String[] args) {
        zigzagConversion("PAYPALISHIRING", 3);
    }

    public static void zigzagConversion(String str, int nRows){

        char[] c= str.toCharArray();
        int start=0;
        StringBuffer[] sb = new StringBuffer[nRows];
        int len=c.length;

        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i=0;
        while(i<len){
            for(int idx=0; idx<nRows && i<len; idx++){
                sb[idx].append(c[i++]);
            }

            for(int idx=nRows-2; idx>=1 && i<len; idx--){
                sb[idx].append(c[i++]);
            }
        }

        for(int idx=1; idx<sb.length; idx++){
            sb[0].append(sb[idx]);
        }

        System.out.println("The final string is: "+ String.valueOf(sb[0].toString()));



    }


}
