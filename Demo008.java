import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String storedLoginId = "Santhosh";
        String storedPassword = "12345";
        String reply;
        String loginId = "";
        String password = "";

        do {
            System.out.println("Welcome to Mallareddy University");
            System.out.println("Have you visited our site earlier? (Yes/No)");
            reply = scanner.nextLine();

            if (reply.equalsIgnoreCase("No")) {
                System.out.println("Please log in here.");
                System.out.println("Enter your Login ID:");
                loginId = scanner.nextLine();
                System.out.println("Enter your Password:");
                password = scanner.nextLine();
            } else if (reply.equalsIgnoreCase("Yes")) {
                System.out.println("You are our valid customer. Please log in again.");
                System.out.println("Enter your Login ID:");
                loginId = scanner.nextLine();
                System.out.println("Enter your Password:");
                password = scanner.nextLine();
            } else {
                System.out.println("Invalid response. Please reply with 'Yes' or 'No'.");
                continue; 
            }

        } while (!loginId.equals(storedLoginId) || !password.equals(storedPassword));

        System.out.println("Login successful! Welcome, " + storedLoginId + "!");
        scanner.close();
    }
}
