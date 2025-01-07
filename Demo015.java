
import java.util.Scanner;

public class Demo015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();

        // Swapping values using a temporary variable
        int temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println("After swapping:");
        System.out.println("First value: " + value1);
        System.out.println("Second value: " + value2);
    }
}
