import java.util.Scanner;
public class queue {
    int[] queue;
    int front;
    int rear;
    int capacity;
    queue(int size){
        queue=new int[size];
        front=0;
        rear=-1;
        capacity=size;
    }
    void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=data;
    }
    void dequeue(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        front++;
    }
    void display(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int size=sc.nextInt();
        queue q=new queue(size);
        q.enqueue(10);
        q.enqueue(20);  
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        
            
        
    }


    
}
