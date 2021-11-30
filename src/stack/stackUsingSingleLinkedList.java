package stack;

import java.util.*;

public class stackUsingSingleLinkedList {


    public static void main(String[] args) {
        stackUsingSingleLinkedList StackCustom = new stackUsingSingleLinkedList(5);

        System.out.println("=================");
        StackCustom.pop();
        StackCustom.peek();
        StackCustom.curStackSize();
        StackCustom.push(10);
        StackCustom.push(30);
        StackCustom.push(50);
        StackCustom.curStackSize();
        StackCustom.pop();
        StackCustom.curStackSize();
        StackCustom.push(40);
        StackCustom.push(70);
        StackCustom.push(90);
        StackCustom.push(900);
        StackCustom.curStackSize();
        System.out.println("=================");
        StackCustom.pop();
        StackCustom.peek();
        StackCustom.curStackSize();
        StackCustom.pop();
        StackCustom.pop();
        StackCustom.curStackSize();
        System.out.println("=================");
    }

    int size;
    int stackSize;

    private Node head;

    private class Node{
        Node next;
        int value;
    }

    stackUsingSingleLinkedList(int size){
        this.size=size;
        head=null;
        this.stackSize=stackSize;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(stackSize==size){
            return true;
        }else{
            return false;
        }
    }

    public void push(int pushElement){
        if(!isFull()){
            Node oldHead=head;
            head=new Node();
            head.next=oldHead;
            head.value=pushElement;
            stackSize++;
            System.out.println("The Element "+pushElement+" is pushed on to stack;");
        }else{
            System.out.println("The stack is full , cannot add element "+pushElement);
        }

    }

    public int pop(){

        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        System.out.println("Inside pop");
        int popEle=head.value;
        head=head.next;
        stackSize--;
        return popEle;
    }

    public int peek(){
        if(!isEmpty()){
            System.out.println("The top element in the stack is: "+head.value);
            return head.value;
        }else{
            System.out.println("The stack is empty");
            return -1;
        }
    }

    public int curStackSize(){
        System.out.println("The current stackSize is: ---->  "+ stackSize);
        return stackSize;
    }

}
