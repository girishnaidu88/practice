package medium;

import java.util.HashSet;
import java.util.Set;

public class strHasAllUniqueChars {
    public static void main(String[] args) {
        System.out.println("The str has all uniques chars using hashSet: "+hasUniqueCharsUsingHashset("abcA"));
        System.out.println("The str has all uniques chars using indexof() & lastIndexof() methods : "+hasUniqueCharsUsingIndexMethods("abcA"));
    }

    public static boolean hasUniqueCharsUsingHashset(String str){
        Set<Character> s=new HashSet<>();
        for(int i=0; i<str.length();i++){
            if(s.contains(str.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static boolean hasUniqueCharsUsingIndexMethods(String str){

        for(int i=0; i<str.length(); i++){
            if(str.toLowerCase().indexOf(i)!=str.toLowerCase().lastIndexOf(i)){
                return false;
            }
        }
        return true;
    }
}
