import java.util.Scanner;

public class demo_033 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a lowercase character: ");
        char ch = s1.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            char upperCaseChar = (char) (ch - 32);
            System.out.println("Uppercase: " + upperCaseChar);
        } else {
            System.out.println("The entered character is not a lowercase letter.");
        }
        s1.close();
    }
}
