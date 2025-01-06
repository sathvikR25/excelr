package training1;

public class FullTimeEmployee extends Employee {

    private double annualSalary;

    // Default constructor
    public FullTimeEmployee() {
    }

    // Parameterized constructor
    public FullTimeEmployee(int id, String firstName, String lastName, String address, double annualSalary) {
        super(id, firstName, lastName, address); // Call parent class constructor
        this.annualSalary = annualSalary;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("FullTime Employee Details:");
        System.out.println("ID: " + super.id);
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + super.address);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
