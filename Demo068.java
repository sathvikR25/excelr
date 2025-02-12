
public class Demo068 {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 22, 37, 40, 55, 60 };
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers in the array: " + count);
    }
}
