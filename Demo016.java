import java.util.Scanner;

public class Demo016 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String n = s1.nextLine();

        String reversed = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reversed += n.charAt(i);
        }

        if (n.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
