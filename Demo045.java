/*Write a Java program to swap 2 numbers without a 3rd variable */

import java.util.Scanner;

public class Demo045 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = s1.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s1.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        num1 = num1 + num2; 
        num2 = num1 - num2; 
        num1 = num1 - num2; 

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
