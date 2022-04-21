package google;

import java.util.*;

public class stockPriceFluctuations {

    public static void main(String[] args) {
//        Complexity
//        Time O(logn) for each function
//        Space O(n)
    }

    static TreeMap<Integer, Integer> record=new TreeMap<>();
    static TreeMap<Integer, Set<Integer>> vals=new TreeMap<>();

    public static void update(int timeStamp, int price){
        if(record.containsKey(timeStamp)){
            int prevPrice=record.get(timeStamp);
            Set<Integer> book=vals.get(prevPrice);
            book.remove(timeStamp);

            if(book.isEmpty()){
                vals.remove(prevPrice);
            }
        }
        vals.putIfAbsent(price, new HashSet<>());
        vals.get(price).add(timeStamp);
        record.put(timeStamp, price);
    }

    public static int current(){
        return record.lastEntry().getValue();
    }

    public static int maximum(){
        return vals.lastKey();
    }

    public static int minimum(){
        return vals.firstKey();
    }



}
