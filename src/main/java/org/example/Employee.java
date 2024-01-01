package org.example;

public class Employee extends Person {
    private String role;
    private String employeeId;

    public Employee(String firstName, String lastName, int contactNumber, String email, String role, String employeeId) {
        super(firstName, lastName, contactNumber, email);
        this.role = role;
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, int contactNumber, String email) {
        super(firstName, lastName, contactNumber, email);
    }

    public Employee() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", employeeId='" + employeeId + '\'' +
                "} " + super.toString();
    }
}
