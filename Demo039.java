/*java program to check character lowercase or uppercase or digit */

import java.util.Scanner;

public class Demo039 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char a = s1.nextLine().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("The Character is lowerCase. ");
        }else if(a >= 'A' && a <= 'Z'){
            System.out.println("The Character is upperCase. ");
        }else if(a >= 0 && a<= 9){
            System.out.println("The input is a digit. ");
        }else{
            System.out.println("The input is neither Digit or character ");
        }

    }

}
