/*Java program to convert an uppercase character into lowercase */


import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char ch = s1.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            char lowercaseChar = Character.toLowerCase(ch);
            System.out.println("The lowercase character is: " + lowercaseChar);
        } else {
            System.out.println("The input is not an uppercase letter.");
        }
    }
}
