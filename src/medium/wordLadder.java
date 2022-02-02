package medium;

import java.sql.*;
import java.util.*;

public class wordLadder {

    public static void main(String[] args){

        String[] listWords={"hot","dot","dog","lot","log","cog"};

        System.out.println("Length of chain is: "+ladder("hit", "cog", Arrays.asList(listWords)));
        System.out.println("Length of chain is: "+ladder("hit", "dog", Arrays.asList(listWords)));
        System.out.println("Length of chain is: "+ladder("hit", "lod", Arrays.asList(listWords)));

    }




    public static int ladder(String bWord, String eWord, List<String> wList){

        Set<String> set=new HashSet<>(wList);
        Queue<String> q=new LinkedList<>();

        //Add Begining word to queue
        q.add(bWord);
        int count =1;

        //Iterate through all the words in queue
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0; i<size; i++){
                //Convert the word in to char array
                char[] current=q.poll().toCharArray();

                //iterate through each word in the char array
                for(int j=0; j<current.length; j++){

                    //Store in the temp variable for the future use.
                    char temp=current[j];

                    for(char c='a'; c <='z'; c++){
                        current[j]=c;

                        String next=new String(current);

                        if(set.contains(next)){
                            if(next.equals(eWord)){
                                return count+1;
                            }
                            q.add(next);
                            set.remove(next);
                        }

                    }
                    //To get the original word
                    current[j]=temp;
                }
            }
            count++;
        }

        return 0;
    }

}
