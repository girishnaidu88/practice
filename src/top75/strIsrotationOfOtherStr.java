package top75;

public class strIsrotationOfOtherStr {
    public static void main(String[] args) {
        System.out.println("The given strings are rotation of other string: "+ isRotation("abc", "bca"));
        System.out.println("The given strings are rotation of other string: "+ isRotation("abc", "bcA"));
        System.out.println("The given strings are rotation of other string: "+ isRotation(" ", " "));
        System.out.println("The given strings are rotation of other string: "+ isRotation("    ", " "));
        System.out.println("The given strings are rotation of other string: "+ isRotation("", ""));
    }

    public static boolean isRotation(String s, String s1){
        if(s.length()!=s1.length()){
            System.out.println("Length not equal");
            return false;
        }else{
            if(s.length() <= 1 || s==null || s1==null){
                System.out.println("String is either null or 1 char");
                return true;
            }

            String s2=s+s;
            if(!s2.contains(s1)){
                System.out.println("String is not matching");
                return false;
            }
        }
        System.out.println("The string is rotation");
        return true;
    }

}
