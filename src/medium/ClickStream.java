package medium;

import java.util.*;

public class ClickStream {
    public static void main(String[] argv) {
        String[] user0 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
        String[] user1 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
        String[] user2 = {"a", "/one", "/two"};
        String[] user3 = {"/pink", "/orange", "/yellow", "/plum", "/blue", "/tan", "/red", "/amber", "/HotRodPink", "/CornflowerBlue", "/LightGoldenRodYellow", "/BritishRacingGreen"};
        String[] user4 = {"/pink", "/orange", "/amber", "/BritishRacingGreen", "/plum", "/blue", "/tan", "/red", "/lavender", "/HotRodPink", "/CornflowerBlue", "/LightGoldenRodYellow"};
        String[] user5 = {"a"};
        String[] user6 = {"/pink", "/orange", "/six", "/plum", "/seven", "/tan", "/red", "/amber"};

        System.out.println(findContiguousHistory(user0, user1));
        System.out.println(findContiguousHistory(user0, user2));
        System.out.println(findContiguousHistory(user2, user1));
        System.out.println(findContiguousHistory(user5, user2));
        System.out.println(findContiguousHistory(user3, user4));
        System.out.println(findContiguousHistory(user4, user3));
        System.out.println(findContiguousHistory(user3, user6));


    }

    public static List<String> findContiguousHistory(String[] array1, String[] array2){

        List<String> res=new ArrayList<>();

        String[] longArray=array1;
        String[] shortArray=array2;

        if(array1.length < array2.length){
            longArray=array2;
            shortArray=array1;
        }

        Map<String, Integer> map=new HashMap<>();

        for(int i=0; i<longArray.length; i++){
            map.put(longArray[i], i);
        }


        for(int j=0; j<shortArray.length; j++){
            String str=shortArray[j];

            List<String> curr=new ArrayList<>();

            if(map.containsKey(str)){

                int index=map.get(str);
                int k=j;

                while(index<longArray.length && k<shortArray.length){
                    if(longArray[index].equalsIgnoreCase(shortArray[k])){
                        curr.add(shortArray[k]);
                    }else{
                        break;
                    }
                    index++;
                    k++;
                }
                if(res.size() < curr.size()){
                    res=curr;
                }
            }
        }

        return res;
    }


}
