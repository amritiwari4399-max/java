import java.util.Scanner;
public class shiftingzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = shiftZeros(arr);
        System.out.println("The array after shifting zeros to the end is:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }

    public static int[] shiftZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
    }
    
}
