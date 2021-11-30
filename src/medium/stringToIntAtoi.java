package medium;

public class stringToIntAtoi {

    public static void main(String[] args) {
        System.out.println(strToInt("1234543"));
    }

    public static int strToInt(String str){
        int result=0;

        for(int i=0; i<str.length(); i++){
            result = result * 10 + str.charAt(i) - '0';
        }

        return result;
    }
}
