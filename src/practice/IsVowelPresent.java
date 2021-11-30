package practice;

public class IsVowelPresent {

    public static void main(String[] args) {

        System.out.println(isVowelPresent("HeLl0"));
        System.out.println(isVowelPresent("TV"));
    }

    public static boolean isVowelPresent(String text){
        if(!text.toLowerCase().matches(".*[aeiou].*")){
            return false;
        }
        return true;
    }


}
