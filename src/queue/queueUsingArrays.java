package queue;

public class queueUsingArrays {

    public static void main(String[] args) {
        queueUsingArrays queue = new queueUsingArrays(5);
        queue.deQueue();
        queue.queueSize();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(-1);
        queue.queueSize();
        queue.printQueue();
        queue.deQueue();
        queue.queueSize();
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }


    private int capacity;
    int front;
    int rear;
    int currSize=0;
    int[] queueArr;

    queueUsingArrays(int sizeOfQueue){
        this.capacity=sizeOfQueue;
        front=0;
        rear=-1;
        queueArr= new int[this.capacity];
    }


    public boolean isFull(){
        if(currSize==capacity){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(currSize==0){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("The Queue is full!!!!");
            return;
        }else{
            rear++;
            if(rear==capacity-1){
                rear=0;
            }
            queueArr[rear]=data;
            currSize++;
            System.out.println("The data "+data+" is inserted successfully");
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty and has no elements to delete");
            return;
        }else{
            front++;
            if(front==capacity-1){
                front=0;
                System.out.println("The item removed from queue is --> "+queueArr[front-1]);
            }else{
                System.out.println("The item removed from queue is --> "+queueArr[front-1]);
            }
            currSize--;
        }
    }

    public void printQueue(){
        if(currSize==0){
            System.out.println("The queue is empty and has no elements to DISPLAY");
        }else{
            System.out.print("{ ");
            for(int i=0; i<currSize; i++){
                System.out.print(queueArr[i]+" ");
            }
            System.out.println("}");
        }
    }

    public void queueSize(){
        System.out.println("The queue size is: "+currSize);
    }


}
