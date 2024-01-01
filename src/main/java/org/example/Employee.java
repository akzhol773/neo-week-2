package org.example;

public class Employee extends Person {
    private String role;

    private Bookstore workingBranch;
    private String employeeId;

    public Employee(String firstName, String lastName, int contactNumber, String email, String role, Bookstore workingBranch, String employeeId) {
        super(firstName, lastName, contactNumber, email);
        this.role = role;
        this.workingBranch = workingBranch;
        this.employeeId = employeeId;
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", workingBranch=" + workingBranch +
                ", employeeId='" + employeeId + '\'' +
                "} " + super.toString();
    }
}
