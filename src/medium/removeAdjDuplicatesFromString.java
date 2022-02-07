package medium;

public class removeAdjDuplicatesFromString {

    public static void main(String[] args) {
        System.out.println(removeDups("axxazy"));
        System.out.println(removeDups("b aa b"));
        System.out.println(removeDups("  "));
        System.out.println(removeDups(" "));
        System.out.println(removeDups("b aa B"));
    }

    public static String removeDups(String s){
        StringBuilder sb=new StringBuilder();
        int sbLength=0;

        for(char c: s.toCharArray()){
            if(sbLength !=0 && c==sb.charAt(sbLength-1)){
                sb.deleteCharAt(sbLength-- -1);
            }else{
                sb.append(c);
                sbLength++;
            }
        }

        return sb.toString();
    }

}
