package easy;

public class lengthOfLastWord {

    public static void main(String[] args) {
        System.out.println("The length of the last word is: "+lastWordLength("This is the las word   "));
        System.out.println("The length of the last word is: "+lastWordLength("This is the las word12 3  "));
        System.out.println("The length of the last word is: "+lastlastWordLengthWithTrimFunc("This is the las word12212132321312312312@#$%^&*()   "));
        System.out.println("The length of the last word is: "+lastlastWordLengthWithTrimFunc("This is the las word   *%$#@#$%^&*(*&^%$#@#$%^&"));
    }

    public static int lastWordLength(String str){
        String[] s=str.split(" ");
        return s[s.length-1].length();
    }

    public static int lastlastWordLengthWithTrimFunc(String str){
        return str.trim().length()-str.trim().lastIndexOf(" ")-1;
    }

}
