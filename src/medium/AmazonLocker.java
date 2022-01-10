package medium;

import java.util.*;

public class AmazonLocker {

    //Locker Class
    public static class Locker {
        public static HashMap<Integer,Integer> small;
        public static HashMap<Integer,Integer> medium;
        public static HashMap<Integer,Integer> large;
        static int s,x,l;
        static int sCount,xCount,lCount;
        Locker()
        {
            small = new HashMap<Integer,Integer>();
            medium = new HashMap<Integer,Integer>();
            large = new HashMap<Integer,Integer>();
            s = 50;
            x = 100;
            l = 150;
            sCount = 0;
            xCount = 0;
            lCount = 0;
        }

        public static void  setLocker(Item item) {
            Integer itemId = item.id;
            ItemSize size = item.size;
            if(size.equals(ItemSize.small) && sCount!=s) {
                if(!small.containsValue(itemId)) {
                    small.put(sCount, itemId);
                    sCount++;
                }
            }
            else if(size.equals(ItemSize.medium) && xCount!=x || (size.equals(ItemSize.small) && sCount==s )) {
                if(!medium.containsValue(itemId)) {
                    medium.put(xCount, itemId);
                    xCount++;
                }
            }
            else if(size.equals(ItemSize.large) && lCount!=l || (size.equals(ItemSize.small) && sCount==s ) || (size.equals(ItemSize.medium) && xCount==x )){
                if(!large.containsValue(itemId)) {
                    large.put(xCount, itemId);
                    lCount++;
                }
            }else {
                System.out.println("All the lcokers are Full");
            }
        }

        public static int getLocker(Item item) {
            Integer itemId = item.id;
            ItemSize size = item.size;
            if(size.equals(ItemSize.small)) {
                if(small.containsValue(itemId)) {
                    for(Map.Entry<Integer, Integer> entry : small.entrySet()) {
                        if(itemId.equals(entry.getValue())) {
                            sCount--;
                            return entry.getKey();
                        }
                    }
                }
            }
            if(size.equals(ItemSize.medium) || size.equals(ItemSize.small)) {
                if(medium.containsValue(itemId)) {
                    for(Map.Entry<Integer, Integer> entry :medium.entrySet()) {
                        if(itemId.equals(entry.getValue())) {
                            if(size.equals(ItemSize.medium)) {
                                xCount--;
//                                System.out.println("Here: "+entry.getKey());
                                return entry.getKey();
                            }
                        }
                    }
                }
            }
            if(size.equals(ItemSize.large)|| size.equals(ItemSize.medium) || size.equals(ItemSize.small) ) {
                if(large.containsValue(size)) {
                    for(Map.Entry<Integer,Integer> entry : large.entrySet()) {
                        if(size.equals(entry.getValue())) {
                            lCount--;
                            return entry.getKey();
                        }
                    }
                }
            }
            return -1;
        }
    }

    // Item or package class
    public static class Item {
        Integer id;
        ItemSize size;
        public Item(Integer id,ItemSize size)
        {
            this.id = id;
            this.size = size;
        }
    }

    public static enum ItemSize {
        small,
        medium,
        large
    }

//    public class LockerController {
        // locker controller
        public static void main(String args[]) {
            Locker locker = new Locker();
            Item sItem = new Item(1, ItemSize.small);
            Item mItem = new Item(5, ItemSize.medium);
            Item lItem = new Item(10, ItemSize.large);
            mItem = new Item(12, ItemSize.medium);
            sItem = new Item(15, ItemSize.small);
             mItem = new Item(55, ItemSize.medium);
             lItem = new Item(101, ItemSize.large);
            mItem = new Item(12, ItemSize.medium);
            locker.setLocker(sItem);
            locker.setLocker(mItem);
            locker.setLocker(lItem);
            locker.setLocker(mItem);
            System.out.println("The locker id for item id 12 is " + locker.getLocker(mItem));
        }

}
