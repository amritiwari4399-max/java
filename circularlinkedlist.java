public class circularlinkedlist {
    void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head; 
        } else {
            node temp = head;
            while (temp.next != head) { 
                temp = temp.next;
            }
            temp.next = newnode; 
            newnode.next = head; 
        }
        public static void main(String[] args) {
            circularlinkedlist ob = new circularlinkedlist();
            ob.insert(10);
            ob.display();
            ob.insert(20);
            ob.display();
            ob.insert(30);
            ob.display();
        }
        void display() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                node temp = head;
                System.out.print("Circular Linked List till now: ");
                do {
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                } while (temp != head);
                System.out.println("(back to head)");
            }
        }   
    }
    
}
