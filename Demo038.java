 /*Checking lowercase or UpperCase*/

 import java.util.Scanner;

 public class Demo038 {
     public static void main(String[] args) {
         Scanner s1 = new Scanner(System.in);
 
         System.out.print("Enter a character: ");
         char ch = s1.next().charAt(0);
 
         if (ch >= 'A' && ch <= 'Z') {
             System.out.println(ch + " is an uppercase letter.");
         } else if (ch >= 'a' && ch <= 'z') {
             System.out.println(ch + " is a lowercase letter.");
         } else {
             System.out.println(ch + " is not a letter.");
         }
 
     }
 }
 