public class Demo015 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
