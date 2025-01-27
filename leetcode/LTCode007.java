public class LTCode_007 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  
                return digits;  
            }
            digits[i] = 0;  
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;  

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.print("Output: ");
        printArray(result1);

        int[] digits2 = {9, 9, 9};
        int[] result2 = plusOne(digits2);
        System.out.print("Output: ");
        printArray(result2);

        int[] digits3 = {4, 3, 2, 1};
        int[] result3 = plusOne(digits3);
        System.out.print("Output: ");
        printArray(result3);

        int[] digits4 = {0};
        int[] result4 = plusOne(digits4);
        System.out.print("Output: ");
        printArray(result4);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
