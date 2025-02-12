public class Demo075 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 1, 100 };
        int max = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}