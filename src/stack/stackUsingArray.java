package stack;

import java.util.*;

public class stackUsingArray {

    public static void main(String[] args) {
        stackUsingArray StackCustom = new stackUsingArray(5);

        System.out.println("=================");
        StackCustom.pop();
        StackCustom.peek();
        StackCustom.push(10);
        StackCustom.push(30);
        StackCustom.push(50);
        StackCustom.push(40);
        StackCustom.push(70);
        StackCustom.push(90);
        StackCustom.printStack(StackCustom);
        stackUsingArray sortedStack = StackCustom.sortStack(StackCustom);
        System.out.println("=================");
        System.out.println("After Sorting :");
        System.out.println("=================");
        StackCustom.printStack(sortedStack);
        System.out.println("=================");
//        StackCustom.pop();
//        StackCustom.peek();
//        StackCustom.pop();
//        StackCustom.pop();
        System.out.println("=================");
    }

    int top;
    int size;
    int arr[];


    stackUsingArray(int size){
        this.top=-1;
        this.arr =new int[size];
        this.size=size;
    }


    //isFull, isEmpty, push, pop, peek
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }


    public boolean isFull(){
        if(size-1 ==top){
            return true;
        }else{
            return false;
        }
    }

    public void push(int pushedElement){
        if(!isFull()){
            top++;
            arr[top]=pushedElement;
            System.out.println("The element "+pushedElement+" is successfully pushed onto the stack");
        }else{
            System.out.println("The stack is full and cannot add more elements");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int popTop=top;
            top--;
            System.out.println("The popped element from the stack is: "+arr[popTop]);
            return arr[popTop];
        }else{
            System.out.println("The stack is empty");
            return -1;
        }
    }

    public int peek(){
        if(!isEmpty()){
            System.out.println("The top element of the stack is: "+arr[top]);
            return arr[top];

        }else{
            System.out.println("The Stack is empty");
            return -1;
        }
    }


    public static stackUsingArray sortStack(stackUsingArray stack){

        stackUsingArray tempStack = new stackUsingArray(10);

        while(!stack.isEmpty()){
            int currData=stack.pop();
            while(!tempStack.isEmpty() && tempStack.pop()> currData){
                stack.push(tempStack.pop());
            }
            tempStack.push(currData);
        }

        return tempStack;
    }

    public void printStack(stackUsingArray stack){

        if(top>=0){
            System.out.println("The items of the stack are: ");
            for(int i = 0; i <= top; i++) {
                System.out.println(stack.peek());
                top--;
            }
        }else{
            System.out.println("The stack is empty and no elements to display.");
            return;
        }
    }

}
