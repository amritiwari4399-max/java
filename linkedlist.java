import java.util.*;
public class linkedlist {
    static node head;
    public static void main(String[] args) {
        node newnode=new node(10);
        if(head==null){
            head=newnode;
        }
        node temp=head;
        node newnode1=new node(20);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode1;
        node temp1=head;
        while(temp1!=null){
            System.out.println(temp1.data+"->");

            temp1=temp1.next;
        }


    }

    
}
