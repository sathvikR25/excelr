/*Biggest Number Among three numbers */

import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a = s1.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = s1.nextInt();

        System.out.print("Enter the Third Number: ");
        int c = s1.nextInt();

        if (a > b && a > c) {
            System.out.println("The Biggest Number is " + a);
        } else if (b > c && b > a) {
            System.out.println("The Biggest Number is " + b);
        } else if (c > a && c > b) {
            System.out.println("the Biggest Number is " + c);
        }

    }
}
