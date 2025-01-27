import java.util.Scanner;

public class Demo019 {
    static int num;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = s1.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series up to " + num + " terms:");
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        s1.close();
    }
}
