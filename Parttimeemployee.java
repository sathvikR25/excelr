package training1;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double amountPerHour;

    // Default constructor
    public PartTimeEmployee() {
    }

    // Parameterized constructor
    public PartTimeEmployee(int id, String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
        super(id, firstName, lastName, address); // Call parent class constructor
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    // Method to compute salary
    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("PartTime Employee Details:");
        System.out.println("ID: " + super.id);
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + super.address);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: " + amountPerHour);
        System.out.println("Salary: " + computeSal());
    }
}
