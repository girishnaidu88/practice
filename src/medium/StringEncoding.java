package medium;

public class StringEncoding {

    public static void main(String[] args) {
        System.out.println(encodeStr("aaabbcdab"));
        System.out.println(encodeStr("aaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(encodeStr(""));
    }

    public static String encodeStr(String str){
        StringBuffer sb = new StringBuffer();

        if(str==null || str.length()==0){
            return "nothing";
        }

        char[] strChar=str.toCharArray();
        int count=0;
        char previous=0;

        for(char c : strChar){
            if(previous==0){
                previous=c;
                count++;
            }else if(previous!=c){
                sb.append(count).append(previous);
                count=1;
                previous=c;

            }else {
                count++;
            }
        }

        sb.append(count).append(previous);



        return sb.toString();
    }
}
