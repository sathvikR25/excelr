/* Java program to check the largest number among 4 numbers */

import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter the First Number: ");
        int a = s1.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = s1.nextInt();
        
        System.out.print("Enter the Third Number: ");
        int c = s1.nextInt();
        
        System.out.print("Enter the Fourth Number: ");
        int d = s1.nextInt();

        if(a > b && a > c && a > d){
            System.out.println("The First Number " + a + " is the largest.");
        } else if(b > a && b > c && b > d){
            System.out.println("The Second Number " + b + " is the largest.");
        } else if(c > a && c > b && c > d){
            System.out.println("The Third Number " + c + " is the largest.");
        } else {
            System.out.println("The Fourth Number " + d + " is the largest.");
        }
    }
}
