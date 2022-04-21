package google;

import java.util.*;

public class snapShotArray {
    public static void main(String[] args) {
//        ["SnapshotArray","set","snap","set","get"]
//        [[3],[0,5],[],[0,6],[0,0]]

//        Time O(logS)
//                Space O(S)
//        where S is the number of set called.
    }

    static TreeMap<Integer, Integer>[] A;
    static int snapId=0;

    public static void SnapshotArray(int length){
        A=new TreeMap[length];
        for(int i=0; i<length; i++){
            A[i]=new TreeMap<Integer, Integer>();
            A[i].put(0,0);
        }
    }

    public static void set(int index, int val){
        A[index].put(snapId, val);
    }

    public static int snap(){
        return snapId++;
    }

    public static int get(int index, int snapId){
        return A[index].floorEntry(snapId).getValue();
    }
}
