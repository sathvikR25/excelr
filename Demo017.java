import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = s1.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = s1.nextInt();

        int a = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + a);
    }
}