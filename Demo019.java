
import java.util.Scanner;

public class Demo019 {

    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Error: Number of terms must be a positive integer");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm);

        for (int i = 1; i < n; i++) {
            System.out.print(", " + secondTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();
        printFibonacciSeries(n);
    }
}
