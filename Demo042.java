/*Java program to convert a lowercase character into uppercase */


import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = s1.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            char uppercaseChar = Character.toUpperCase(ch);
            System.out.println("The uppercase character is: " + uppercaseChar);
        } else {
            System.out.println("The input is not a lowercase letter.");
        }
    }
}
