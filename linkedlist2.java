public class linkedlist2 {
    static node head;
    void insert(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            node temp = head;
            System.out.print("Linked List till now: ");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
           
            }
            System.out.println("null");
    }
    public static void main(String[] args) {
        linkedlist2 ob = new linkedlist2();
        ob.insert(10);
        ob.display();
        ob.insert(20);
        ob.display();
        ob.insert(30);
        ob.display();
    }


    
}