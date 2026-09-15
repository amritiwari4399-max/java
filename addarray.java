import java.util.*;
public class addarray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the arrays: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] sumArray = new int[n];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sumArray[i] = a1[i] + a2[i];
        }

        System.out.println("Sum of the two arrays:");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
    }
    
}
