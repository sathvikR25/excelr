import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = s1.nextInt();

        System.out.print("Enter the Second number: ");
        int b = s1.nextInt();

        int swap = a;
        a = b;
        b = swap;

        System.out.println("Before Swapping: ");
        System.out.println(b);
        System.out.println(a);
    

        System.out.println("After Swapping: ");
        System.out.println(a);
        System.out.println(b);
    }
}
