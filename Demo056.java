import java.util.Scanner;

class Demo056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sumOfCubes = 0;
        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number /= 10;
        }
        
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
        
        sc.close();
    }
}