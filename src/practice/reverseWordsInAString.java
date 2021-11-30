package practice;

public class reverseWordsInAString {
    public static void main(String[] args) {
        reverseWordsInaString("The sky is blue");
    }

    public static void reverseWordsInaString(String str){
        char[] s=str.toCharArray();
        System.out.println("Original String: "+String.valueOf(s));
        int i=0;
        for(int j=0; j< s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
            }
        }

        reverse(s, i, s.length-1);
        reverse(s, 0, s.length-1);

        System.out.println("Reversed String: "+String.valueOf(s));
    }

    public static void reverse(char[] s, int i, int j){
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

}
