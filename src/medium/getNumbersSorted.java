package medium;

import java.util.*;

public class getNumbersSorted {

        public static void main(String[] args){
            getNumerics("a1b32b0");
        }

        public static void getNumerics(String str){
            //a1b32b0
            Map<Integer, Integer> map=new HashMap<>();
            int i;
            for(i=0; i <str.length(); i++){
                char c=str.charAt(i);

                if(Character.isDigit(c)){

                    StringBuilder sb=new StringBuilder();
                    sb.append(c); //0

                    for(int j=i+1; j<str.length(); j++){
                        if(Character.isDigit(str.charAt(j))){
                            sb.append(str.charAt(j)); //32
                            i=j;
                        }else{
                            break;
                        }
                    }

                    int n=Integer.valueOf(sb.toString());
                    if(!map.containsKey(n)){
                        map.put(n, 1);
                    }
                }
            }

            System.out.println((map.keySet().toString())) ;

        }






    }
