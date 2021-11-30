package Hard;

import java.sql.*;
import java.util.*;

public class wordLadder {

    public static void main(String[] args){
        // make dictionary
        Set<String> D = new HashSet<String>();
        D.add("poon");
        D.add("plee");
        D.add("same");
        D.add("poie");
        D.add("plie");
        D.add("poin");
        D.add("plea");
        String start = "toon";
        String target = "plea";
        System.out.print("Length of shortest chain is: "
                + shortestChainLen(start, target, D));


//        Set<String> D = new HashSet<String>();
//        D.add("hit");
//        D.add("hot");
//        D.add("dot");
//        D.add("dog");
//        D.add("lot");
//        D.add("log");
//        D.add("cog");
//        String start1 = "hit";
//        String target1 = "cog";
//        System.out.print("Length of shortest chain is: "
//                + shortestChainLen(start1, target1, D));

    }

    public static int shortestChainLen(String start, String endWord, Set<String> D){

        if(!D.contains(endWord)){
            System.out.println("The End word is not in the SET");
            return -1;
        }

        if(start==endWord){
            return 0;
        }

        Queue<String> q = new LinkedList<String>();
        q.add(start);

        int depth=0, wordLength=start.length();

        while(!q.isEmpty()){

            depth++;

            int qSize=q.size();

            for(int i=0; i<qSize; i++){

                char[] word= q.peek().toCharArray();
                q.remove();

                for(int pos=0; pos< wordLength; pos++){
                    char orig_char=word[pos];

                    for(char c='a'; c<='z'; c++){
                        word[pos]=c;

                        if(String.valueOf(word).equals(endWord)){
                            return ++depth;
                        }

                        if(!D.contains(String.valueOf(word))){
                            continue;
                        }

                        D.remove(String.valueOf(word));

                        q.add(String.valueOf(word));
                    }
                    word[pos]=orig_char;
                }

            }

        }

        return 0;
    }

}
