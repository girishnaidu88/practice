package medium;

import java.util.*;

public class LRUCache {


    class Node{
        Node prev, next;
        int key, value;
        Node(int _key, int _value){
            key=_key;
            value=_value;
        }
    }

    //Global var and DS
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Map<Integer, Node> map=new HashMap<>();
    int capacity;

    //Constructor to initialize the values
    public LRUCache(int _capacity){
        capacity=_capacity;
        head.next=tail;
        tail.prev=head;
    }

    //get function
    public int get(int key){
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }

    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        if(map.size()==capacity){
            remove(tail.prev);
        }

        insert(new Node(key, value));
    }


    public void remove(Node node){
        //remove from the cache/Map
        map.remove(node.key);

        //remove the node between tail and tail.prev
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insert(Node node){
        //Put into the cache/Map
        map.put(node.key, node);

        //add new node between the head and head.next
        Node headNext= head.next;

        head.next=node;
        node.prev=head;
        headNext.prev=node;
        node.next=headNext;
        System.out.println("The "+node.key+" is inserted successfully");
    }

    public int getSize(){
        return map.size();
    }

    public void display(){
        if(map.size()==0){
            System.out.println("There is no elements to display");
        }else{
            System.out.println("The current elements of the cache: ");
            for(Map.Entry<Integer, Node> iter: map.entrySet()){
                System.out.print(iter.getKey()+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        LRUCache cache=new LRUCache(2);
        System.out.println("Get 1: "+cache.get(1));
        cache.display();
        cache.put(1,15);
        System.out.println("The map size: "+cache.getSize());
        System.out.println("Get 1: "+cache.get(1));
        cache.put(2, 20);
        System.out.println("Get 2: "+cache.get(2));
        cache.put(3,30);
        System.out.println("Get 1: "+cache.get(1));
        cache.put(4,40);
        cache.display();
        System.out.println("Get 2: "+cache.get(2));
        System.out.println("Get 3: "+cache.get(3));
        System.out.println("Get 4: "+cache.get(4));


    }


}
