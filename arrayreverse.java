import java.util.Scanner;
public class arrayreverse {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            arr[i] = arr[size - 1 - i];

        }
        System.out.println("The reversed array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }   
        sc.close();
    }
}