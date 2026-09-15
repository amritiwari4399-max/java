import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = ab.nextInt();
        double billAmount = 0;

        if (units <= 100) {
            billAmount = 0;
        } else if (units <= 200) {
            billAmount = (units - 100) * 5;
        } else if (units <= 300) {
            billAmount = (100 * 5) + (units - 200) * 10;
        } else if (units <= 400) {
            billAmount = (100 * 5) + (100 * 10) + (units - 300) * 15;
        } else {
            billAmount = (100 * 5) + (100 * 10) + (100 * 15) + (units - 400) * 25;
        }

        System.out.println("Total electricity bill: " + billAmount);
    }
}
