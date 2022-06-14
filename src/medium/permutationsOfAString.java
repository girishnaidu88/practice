package medium;

public class permutationsOfAString {

    public static void main(String[] args) {
        String str="ABC";
        System.out.println("The permutaions of the given string: "+str+" are: ");
        strPermutations(str, 0, str.length()-1);
        System.out.println("\n");
        permutations(str, 0, str.length()-1);

//        String str1="ABCDEF";
//        System.out.println("The permutaions of the given string: "+str1+" are: ");
//        strPermutations(str1, 0, str1.length()-1);
    }

    public static void strPermutations(String str, int l, int r){

        if(l==r){
            System.out.println(str);
        }else{
            for(int i=l; i<=r; i++){
                str=swap(str, l, i);
                strPermutations(str, l+1, r);
                str=swap(str, l, i);
            }
        }
    }

    public static String swap(String str, int i, int j){
        char[] cArr=str.toCharArray();
        char temp=cArr[i];
        cArr[i]=cArr[j];
        cArr[j]=temp;
        return String.valueOf(cArr);
    }


    public static void permutations(String str, int l, int r){
        if(l==r){
            System.out.println(str);
        }else{
            for(int i=l; i<=r; i++){
                str=swapStr(str, l, i);
                permutations(str, l+1, r);
                str=swapStr(str, l, i);
            }
        }
    }

    public static String swapStr(String str, int i, int j){
        char[] c=str.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;

        return String.valueOf(c);
    }





























}
