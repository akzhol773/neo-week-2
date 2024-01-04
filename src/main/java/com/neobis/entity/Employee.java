package com.neobis.entity;

/**
 * Represents an employee, extending the Person class.
 * Contains employee-specific information such as their role, the bookstore branch they work at, and their employee ID.
 */
public class Employee extends Person {
    // The role of the employee (e.g., Manager, Salesperson)
    private String role;

    // The bookstore branch where the employee works
    private Bookstore workingBranch;
    // Unique identifier for the employee
    private String employeeId;

    /**
     * Constructs a new Employee with specified personal details (from Person class) and employee-specific details.
     *
     * @param firstName     The first name of the employee (inherited from Person)
     * @param lastName      The last name of the employee (inherited from Person)
     * @param contactNumber The contact number of the employee (inherited from Person)
     * @param email         The email address of the employee (inherited from Person)
     * @param role          The role of the employee
     * @param workingBranch The bookstore branch where the employee works
     * @param employeeId    The unique identifier for the employee
     */
    public Employee(String firstName, String lastName, int contactNumber, String email, String role, Bookstore workingBranch, String employeeId) {
        super(firstName, lastName, contactNumber, email); // Call to the super class (Person) constructor
        this.role = role;
        this.workingBranch = workingBranch;
        this.employeeId = employeeId;
    }

    // Getters and setters for employee-specific fields


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Bookstore getWorkingBranch() {
        return workingBranch;
    }

    public void setWorkingBranch(Bookstore workingBranch) {
        this.workingBranch = workingBranch;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Returns a string representation of the Employee object, including both personal and employee-specific details.
     *
     * @return A string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", workingBranch=" + workingBranch +
                ", employeeId='" + employeeId + '\'' +
                "} " + super.toString(); // Includes the toString output from the Person class
    }
}
