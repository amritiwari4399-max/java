public class stacklist {
    node head;
    void push(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int data=head.data;
            head=head.next;
            return data;
        }
    }
    int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return head.data;
        }
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stacklist s=new stacklist();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.display();
    }

    
}
