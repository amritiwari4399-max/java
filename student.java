import java.util.*;

public class student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String a = sc.next();

        System.out.println("Enter first subject marks:");
        int b = sc.nextInt();

        System.out.println("Enter second subject marks:");
        int c = sc.nextInt();

        System.out.println("Enter third subject marks:");
        int d = sc.nextInt();

        double e;
        e = (b + c + d) / 3.0;

        System.out.println("Student Name = " + a);
        System.out.println("Average = " + e);
    }
}
