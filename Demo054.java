class One {
    public void method1() {
        System.out.println("Method Overloading 1 - No parameters.");
    }

    public void method1(String message) {
        System.out.println("Method Overloading 1 - With message: " + message);
    }

    public void method1(int number) {
        System.out.println("Method Overloading 1 - With number: " + number);
    }
}
public class Demo054 {
    public static void main(String[] args) {
        One obj = new One();
        obj.method1();
        obj.method1("Hello!"); 
        obj.method1(42); 
    }
}