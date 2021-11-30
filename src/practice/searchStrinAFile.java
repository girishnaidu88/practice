package practice;

import java.io.*;
import java.util.*;

public class searchStrinAFile {


    public static void main(String[] args) throws IOException{
        System.out.println("The String is present in the file: "+ searchTheStr("/Users/girishkandra/Downloads/testProgFile.txt", "is the"));
    }

    public static boolean searchTheStr(String filePath, String keyText) throws IOException{
        File file = new File(filePath);

        Scanner fileLine = new Scanner(file);

        while(!fileLine.nextLine().trim().contains(keyText.toLowerCase().trim())){
            return false;
        }

        System.out.println("The line read is: "+ String.valueOf(fileLine));
        System.out.println("The key text searched is: "+keyText);
        return true;
    }


}
