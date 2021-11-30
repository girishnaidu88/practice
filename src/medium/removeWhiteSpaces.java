package medium;

public class removeWhiteSpaces {


    public static void main(String[] args) {
        removeWhiteSpace("                  This is the    world   ");
    }

    public static void removeWhiteSpace(String text){
        StringBuffer sb= new StringBuffer();

        for(int i=0; i<text.length();i++){
            if(!Character.isWhitespace(text.charAt(i))){
                sb.append(text.charAt(i));
            }
        }
        System.out.println("The Original String is: "+text);
        System.out.println("The trimmed string is: "+sb);
    }

}
