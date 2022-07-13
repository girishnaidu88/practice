package top75;

public class revereseString {

    public static void main(String[] args) {
        revStrUsingLoop("abc def    tes");
        revStringUsingStrinBuf("abc def    tes");
        revStringUsingInBuiltFunc("abc def    tes");
        System.out.println("Using recursion: "+ revStringUsingRecursion("abc def    tes"));

    }

    public static void revStrUsingLoop(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        System.out.println("Using while loop");
        int i=str.length()-1;
        while(i>=0){
            System.out.print(str.charAt(i));
            i--;
        }
        System.out.println();
    }

    public static void revStringUsingStrinBuf(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println("revStringUsingStrinBuf: "+sb.toString());

    }

    public static void revStringUsingInBuiltFunc(String str){
        StringBuffer sb = new StringBuffer();
        System.out.println("revStringUsingInBuiltFunc: "+sb.append(str).reverse());
    }

    public static String revStringUsingRecursion(String str){
        if(str.length()==1){
           return str;
        }else{
            return str.charAt(str.length()-1) + revStringUsingRecursion(str.substring(0, str.length() -1));
        }
    }

}
