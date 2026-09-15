import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int z=0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                z=1;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (z==0) {
            System.out.println("Element not found");
        }

        
    }
    
}
