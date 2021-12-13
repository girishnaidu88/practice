package medium;

import java.util.*;

public class LFUCache {

    public class Node{
        Node next, prev;
        int key, value, freq;

        Node(int k, int v, int f){
            key=k;
            value=v;
            freq=f;
        }
    }

    Node head, tail;
    int key, value, capacity;
    Map<Integer, Node> cache;

    public LFUCache(int cap){
        capacity=cap;
        cache=new HashMap<>();
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node=cache.get(key);
        remove(node);
        node.freq=node.freq+1;
        addNodeWithUpdatedFreq(node);

        return node.value;
    }

    public void put(int key, int value){
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            node.value=value;
            node.freq=node.freq+1;
            remove(node);
            addNodeWithUpdatedFreq(node);
        }else{
            if(cache.size() >= capacity){
                cache.remove(head.key);
                remove(head);
            }

            Node node=new Node(key, value, 1);
            addNodeWithUpdatedFreq(node);
            cache.put(key, node);
        }
    }


    public void remove(Node node){
        if(node.prev!=null){
            node.prev.next=node.next;
        }else{
            head=node.next;
        }

        if(node.next!=null){
            node.next.prev=node.prev;
        }else{
            tail=node.prev;
        }
    }


    public void addNodeWithUpdatedFreq(Node node){

        if(head!=null && tail!=null){
            Node temp=head;
            while(temp!=null){
                if(temp.freq > node.freq){
                    if(temp==head){
                        node.next=temp;
                        temp.prev=node;
                        head=node;
                        break;
                    }else{
                        node.next=temp;
                        node.prev=temp.prev;
                        temp.prev.next=node;
                        node.prev=temp.prev;
                        break;
                    }
                }else{
                    temp=temp.next;
                    if(temp==null){
                        node.prev=tail;
                        tail.next=node;
                        tail=node;
                        node.next=null;
                        break;
                    }
                }
            }
        }else{
            tail=node;
            head=tail;
        }
    }

    public static void main(String[] args) {
        LFUCache lfu=new LFUCache(2);
        System.out.println("Get 1: "+lfu.get(1));
        lfu.put(1,15);
        System.out.println("Get 1: "+lfu.get(1));
        lfu.put(2, 20);
        System.out.println("Get 2: "+lfu.get(2));
        lfu.put(3,30);
        System.out.println("Get 1: "+lfu.get(1));
        lfu.put(4,40);

        System.out.println("Get 2: "+lfu.get(2));
        System.out.println("Get 3: "+lfu.get(3));
        System.out.println("Get 4: "+lfu.get(4));
    }


}
