public class LTCode_003 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1; 
        int index = 0; 
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        long result = 0; 
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        LTCode_003 solution = new LTCode_003();

        String test1 = "42";
        String test2 = "   -42";
        String test3 = "4193 with words";
        String test4 = "words and 987";
        String test5 = "-91283472332";

        System.out.println("Test 1: " + test1 + " => " + solution.myAtoi(test1)); 
        System.out.println("Test 2: " + test2 + " => " + solution.myAtoi(test2)); 
        System.out.println("Test 3: " + test3 + " => " + solution.myAtoi(test3)); 
        System.out.println("Test 4: " + test4 + " => " + solution.myAtoi(test4));
        System.out.println("Test 5: " + test5 + " => " + solution.myAtoi(test5));
    }
}
