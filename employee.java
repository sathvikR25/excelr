package training1;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to concatenate firstName and lastName
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Getters and Setters (if needed)
}
