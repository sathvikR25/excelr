import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();

        double area = 3.14  * radius *radius;

        System.out.printf("The area of Circle : " +area);

        scanner.close();
    }
}
