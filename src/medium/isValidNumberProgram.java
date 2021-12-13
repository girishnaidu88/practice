package medium;

public class isValidNumberProgram {

    public static void main(String[] args) {
        System.out.println(isValidNum("0.1e21"));
        System.out.println(isValidNum("0.1E21"));
        System.out.println(isValidNum("0.1e2.1"));
        System.out.println(isValidNum("+.1e21"));
        System.out.println(isValidNum("+.1e"));
        System.out.println(isValidNum("+.1e2e1"));
        System.out.println(isValidNum("-123.1e-21"));

    }

    public static boolean isValidNum(String str){
        str=str.trim().toLowerCase();

        if(str.length() ==0){
            return false;
        }

        if(str.length()==1 && !(Character.isDigit(str.charAt(0)))){
            return false;
        }

        if((!Character.isDigit(str.charAt(0))) && str.charAt(0)!='+' && str.charAt(0) != '-' && str.charAt(0) != '.'){
            return false;
        }

        boolean flagDotOrE=false;

        for(int i=1; i<str.length(); i++){

            if(!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.' && str.charAt(i)!='-' && str.charAt(i)!='+' && str.charAt(i)!='e'){
                return false;
            }


            if(str.charAt(i)=='.'){
                if(flagDotOrE==true){
                    return false;
                }

                if(!Character.isDigit(str.charAt(i+1))){
                    return false;
                }

                if(i+1 >= str.length()){
                    return false;
                }
            }else if(str.charAt(i)=='e'){

                if(i+1 >= str.length()){
                    return false;
                }

                if(!Character.isDigit(str.charAt(i-1))){
                    return false;
                }

                if(str.charAt(i+1)!='+' && str.charAt(i+1)!='-' && !Character.isDigit(str.charAt(i+1))){
                    return false;
                }
            }

        }

        return true;
    }

}
