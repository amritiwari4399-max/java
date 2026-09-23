import java.util.*;

public class stack {
    int top = -1;
    int[] arr;

    stack(int size) {
        arr = new int[size];
    }

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = data;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of stack:");
        int size = sc.nextInt();

        stack ob = new stack(size);

        System.out.println("Enter the elements of stack:");
        for (int i = 0; i < size; i++) {
            ob.push(sc.nextInt());
        }

        System.out.println("Elements of stack are:");
        for (int i = ob.top; i >= 0; i--) {
            System.out.println(ob.arr[i]);
        }

        sc.close();
    }
}