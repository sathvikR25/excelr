package PS001;

public class Employee {
    int id = 645;
    String firstname = "Arun";
    String lastName = "Kumar";
    String Address = "Siddipet";

    public void setId() {

    }

    public void setId(int id, String firstname, String lastName, String Address) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.Address = Address;
    }

    public String getFullName() {
        return this.firstname + " " + this.lastName;
    }

    public static void main(String[] args) {
        Employee el = new Employee();
        System.out.println("Name is : " + el.getFullName());
    }
}
