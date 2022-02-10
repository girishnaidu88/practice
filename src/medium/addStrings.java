package medium;

public class addStrings {

    public static void main(String[] args) {
//        System.out.println(addStrings("555", "555"));
//        System.out.println(addStrings("555", " "));
//        System.out.println(addStrings("1", "555"));
//        System.out.println(addStrings(" ", " "));
//        System.out.println(addStrings(" ", ""));
        System.out.println(addStrings("10", "1"));
        System.out.println(addBinaryStrings("1010", "1010"));
    }

    public static String addStrings(String a, String b) {
       StringBuilder sb=new StringBuilder();
       int carry=0;

       for(int i=a.length()-1, j=b.length()-1; i>=0 || j>=0 || carry==1; i--,j--){
           int x= (i<0) ? 0: a.charAt(i)-'0';
           int y= (j<0) ? 0: b.charAt(j)-'0';

           sb.append((x+y+carry)%10);
           carry=(x+y+carry)/10;
       }

       String newStr="";

       if(sb.charAt(0)=='-'){
           newStr="-"+sb.reverse().toString().substring(0, sb.length()-1);
       }else{
           newStr=sb.reverse().toString();
       }

       return newStr;

    }

    public static String addBinaryStrings(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry=0;

        for(int i=a.length()-1, j=b.length()-1; i>=0 || j>=0 || carry==1; i--,j--){
            int x= (i<0) ? 0: a.charAt(i)-'0';
            int y= (j<0) ? 0: b.charAt(j)-'0';

            sb.append((x+y+carry)%2);
            carry=(x+y+carry)/2;
        }

        String newStr="";

        if(sb.charAt(0)=='-'){
            newStr="-"+sb.reverse().toString().substring(0, sb.length()-1);
        }else{
            newStr=sb.reverse().toString();
        }

        return newStr;

    }
}
