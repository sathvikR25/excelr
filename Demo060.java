public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.println("First " + n + " terms of Fibonacci series:");
        System.out.println(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}