/*Java program to check the largest number between 2 numbers */

import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        int a = s1.nextInt();

        System.out.print("Enter the Second Number ");
        int b = s1.nextInt();

        if(a>b){
            System.out.println("The First Number " + a + "is greater than " + b);
        }else if(a<b){
            System.out.println("The Second Number " + b + " is greater than " + a);

        }

    }
    
}
