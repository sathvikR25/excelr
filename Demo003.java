public class Demo003 {
    public static void main(String[] main) {
        int num1 = 20;
        int num2 = 10;
        int num3 = 30; 
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is the greatest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is the greatest number.");
        } else {
            System.out.println("num3 is the greatest number.");
        }
    }
}
