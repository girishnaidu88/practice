package easy;

public class addBinaryStrings {


    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1010"));
        System.out.println(addBinary("101", "1"));
        System.out.println(addBinary("1000", "11"));
    }


    public static String addBinary(String a, String b){
        String result="";
        int s=0, i=a.length()-1, j=b.length()-1;

        while (i>=0 || j>=0 || s==1) {

            s=s+((i>=0) ? a.charAt(i)-'0': 0);
            s=s+((j>=0) ? b.charAt(j)-'0' : 0);

            result= (char) (s%2 + '0') + result;

            s=s/2;

            i--;
            j--;
        }


        return result;
    }
}
