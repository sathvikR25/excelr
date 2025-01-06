package training1;

public class Main {

    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(1, "John", "Doe", "123 Street", 20, 15.50);
        partTimeEmployee.showDetails();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(2, "Jane", "Smith", "456 Avenue", 60000);
        fullTimeEmployee.showDetails();
    }
}
