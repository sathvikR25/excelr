package PS002;

import java.util.Scanner;

class NextMultipleOf100 {

    public static int getNextMultipleOf100(int num) {
        if (num <= 0)
            return -1;
        return ((num / 100) + 1) * 100;
    }
}

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        NextMultipleOf100 obj = new NextMultipleOf100();
        System.out.println("Next multiple of 100: " + obj.getNextMultipleOf100(num));
    }
}