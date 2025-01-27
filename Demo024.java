/*Array of friends' names, phone numbers, and addresses */

public class Demo024 {
    public static void main(String[] args) {
        String[][] friends = {
            {"Tony", "8074038050","Adilabad"},
            {"Sai", "7386855253", "Siddipet"},
            {"Madhav", "8790908879", "Shameerpet"}
        };

        for (String[] friend : friends) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println("----------------------");
        }
    }
}
