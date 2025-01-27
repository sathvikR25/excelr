import java.util.Scanner;

public class LTCode_002 {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10; 
            x /= 10; 
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LTCode_002 solution = new LTCode_002();

        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();

        System.out.println("Reversed number: " + solution.reverse(number));

        scanner.close();
    }
}
