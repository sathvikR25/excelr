
public class Client {

    private double basePay;
    private int hoursWorked;

    // Default constructor
    public Client() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }

    // Parameterized constructor
    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    // Method to compute salary
    public void computeSalary() {
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_MULTIPLIER = 1.5;

        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MIN_WAGE + " per hour.");
        } else if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked must not exceed " + MAX_HOURS + " hours per week.");
        } else {
            double regularPay = Math.min(hoursWorked, REGULAR_HOURS) * basePay;
            double overtimePay = 0;

            if (hoursWorked > REGULAR_HOURS) {
                overtimePay = (hoursWorked - REGULAR_HOURS) * basePay * OVERTIME_MULTIPLIER;
            }

            double totalPay = regularPay + overtimePay;
            System.out.println("Total pay: $" + totalPay);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Employee 1
        Client employee1 = new Client(7.50, 35);
        System.out.print("Employee 1: ");
        employee1.computeSalary();

        // Employee 2
        Client employee2 = new Client(8.20, 47);
        System.out.print("Employee 2: ");
        employee2.computeSalary();

        // Employee 3
        Client employee3 = new Client(10.00, 3);
        System.out.print("Employee 3: ");
        employee3.computeSalary();
    }
}
