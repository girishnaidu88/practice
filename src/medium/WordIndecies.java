package medium;

import java.io.*;
import java.util.*;

public class WordIndecies {

    public static void main(String[] args){
        String path="/Users/girishkandra/Downloads/testWordIndex.txt";
        wordIndex(path);
    }

    public static void wordIndex(String path){

        try{

            File file=new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String lines;

            Map<String, Integer> hMap = new HashMap<>();

            while((lines = br.readLine())!=null){

                String[] words=lines.split("-|,| |:");

                for(String word: words){
                    if(hMap.containsKey(word.toLowerCase())){
                        hMap.put(word.toLowerCase(), hMap.get(word.toLowerCase())+1);
                    }else{
                        hMap.put(word.toLowerCase(), 1);
                    }
                }
            }

            System.out.println(":::::::::::::: The word count ::::::::::::::");
            for(Map.Entry<String, Integer> iter: hMap.entrySet()){
                System.out.println(iter.getKey()+" --> "+iter.getValue());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

}
