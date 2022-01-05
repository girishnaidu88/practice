package medium;

import java.util.*;

public class badgeAccessEntryExit {

    public static void main(String[] argv) {
        String badgeRecords1[][] = new String[][]{{"Martha", "exit"}, {"Paul", "enter"}, {"Martha", "enter"},
                {"Steve", "enter"}, {"Martha", "exit"}, {"Jennifer", "enter"}, {"Paul", "enter"}, {"Curtis", "exit"},
                {"Curtis", "enter"}, {"Paul", "exit"}, {"Martha", "enter"}, {"Martha", "exit"}, {"Jennifer", "exit"},
                {"Paul", "enter"}, {"Paul", "enter"}, {"Martha", "exit"}, {"Paul", "enter"}, {"Paul", "enter"},
                {"Paul", "exit"}, {"Paul", "exit"}};
        // Expected output: ["Paul", "Curtis", "Steve"], ["Martha", "Curtis", "Paul"]

        String badgeRecords2[][] = new String[][]{{"Paul", "enter"}, {"Paul", "exit"},};
        // Expected output: [], []

        String badgeRecords3[][] = new String[][]{{"Paul", "enter"}, {"Paul", "enter"}, {"Paul", "exit"},
                {"Paul", "exit"},};
        // Expected output: ["Paul"], ["Paul"]

        String badgeRecords4[][] = new String[][]{{"Paul", "enter"}, {"Paul", "exit"}, {"Paul", "exit"},
                {"Paul", "enter"},};
        // Expected output: ["Paul"], ["Paul"]

        String[][] badgeRecords5 = new String[][]{{"Martha", "exit"}, {"Paul", "enter"}, {"Martha", "enter"},
                {"Martha", "exit"}, {"Jennifer", "enter"}, {"Paul", "enter"}, {"Curtis", "exit"}, {"Curtis", "enter"},
                {"Paul", "exit"}, {"Martha", "enter"}, {"Martha", "exit"}, {"Jennifer", "exit"}, {"Paul", "enter"},
                {"Paul", "enter"}, {"Martha", "exit"}};
        // Expected output: ["Curtis", "Paul"], ["Martha", "Curtis"]

        String[][] badgeRecords6 = new String[][]{{"Paul", "enter"}, {"Paul", "enter"}, {"Paul", "exit"}};
        // Expected output: ["Paul"], []

        String[][] badgeRecords7 = new String[][]{{"Paul", "enter"}, {"Paul", "exit"}, {"Paul", "exit"}};
        // Expected output: [], ["Paul"]

        String[][] badgeRecords8 = new String[][]{{"Paul", "enter"}, {"Paul", "exit"}, {"Paul", "exit"},
                {"Paul", "enter"}, {"Martha", "enter"}, {"Martha", "exit"}};
        // Expected output: ["Paul"], ["Paul"]

        getInvalidEntryExit(badgeRecords1);
        getInvalidEntryExit(badgeRecords2);
        getInvalidEntryExit(badgeRecords3);
        getInvalidEntryExit(badgeRecords4);
        getInvalidEntryExit(badgeRecords5);
        getInvalidEntryExit(badgeRecords6);
        getInvalidEntryExit(badgeRecords7);
        getInvalidEntryExit(badgeRecords8);

    }

    public static void getInvalidEntryExit(String[][] records){
        Map<String, Stack<String>> map=new HashMap<>();
        Set<String> invalidEntires=new HashSet<>();
        Set<String> invalidExits=new HashSet<>();

        for(String[] record: records){

            //Map contains the record
            if(map.containsKey(record[0])){
                Stack<String> st=map.get(record[0]);

                //When the record is EXIT
                if(record[1].equals("exit")){

                    //When the stack is empty
                    if(st.isEmpty()){
                        invalidExits.add(record[0]);
                    }else{
                        st.pop();
                    }

                    //When the record is ENTER
                }else{
                    if(!st.isEmpty()){
                        invalidEntires.add(record[0]);
                    }else{
                        st.push(record[1]);
                        map.put(record[0], st);
                    }
                }
                //Map doesn't contains the record
            }else{

                //When the record is EXIT
                if(record[1].equals("exit")){
                    invalidExits.add(record[0]);
                }else{
                    Stack<String> st=new Stack<>();
                    st.push(record[1]);
                    map.put(record[0], st);
                }
            }

        }

        for(Map.Entry<String, Stack<String>> iter: map.entrySet()){
            if(!iter.getValue().isEmpty()){
                invalidEntires.add(iter.getKey());
            }
        }

        System.out.println(invalidEntires+" , "+invalidExits);

    }

}
