/* Java program to check if a character is a vowel or consonant */


import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s1.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
