import java.util.Scanner;

public class Demo018 {
    static int min;

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        min = s1.nextInt();

        int minutesInYear = 60 * 24 * 365; 
        int years = min / minutesInYear; 
        int remainingMinutes = min % minutesInYear; 
        int days = remainingMinutes / (60 * 24); 

       
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");

        s1.close();
    }
}
