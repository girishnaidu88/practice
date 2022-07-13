package top75;

public class Strlength {
    public static void main(String[] args) {
        System.out.println("The length of the string char array is: "+findStrLengthUsingCharArr("abc    "));
        System.out.println("The length of the string using exception logic is: "+findStrLengthUsingException("abc    "));
    }

    public static int findStrLengthUsingCharArr(String str){
        char[] cArr=str.toCharArray();
        int count=0;
        for(char c: cArr){
            count++;
        }
        return count;
    }


    public static int findStrLengthUsingException(String str){
        int count=0;
        try{
            for( count=0;;count++){
                str.charAt(count);
            }
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return count;
    }



}
