/*  Array of 10 friends' names */


public class Demo029 {
    public static void main(String[] args) {
        String[][] friends = {
            {"Tony"},
            {"Sai"},
            {"Madhav"},
            {"Arun"},
            {"Narendra"},
            {"Sathwik"},
            {"Yashwanth"},
            {"Vineesh"},
            {"Santhosh"},
            {"Tony"}
        };

        for (String[] friend : friends) {
            System.out.println("Name: " + friend[0]);
            System.out.println("----------------------");
        }
    }
}
