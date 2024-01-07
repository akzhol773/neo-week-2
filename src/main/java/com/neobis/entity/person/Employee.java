package com.neobis.entity.person;


import javax.persistence.*;
import java.util.Objects;

/**
 * Represents an employee, extending the Person class.
 * Contains employee-specific information such as their role, the bookstore branch they work at, and their employee ID.
 */
@Entity
@Table(name = "employee")
public class Employee extends Person {


    // The role of the employee (e.g., Manager, Salesperson)
    @Column(length = 100)
    private String role;





    /**
     * Constructor to initialize an Employee object with personal and employee-specific attributes.
     * This constructor uses the super() method to initialize fields inherited from the Person class.
     *
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param contactNumber The contact number of the employee.
     * @param email The email address of the employee.
     * @param role The role of the employee.
     * @param id The unique identifier for the employee.
     */
    public Employee(Long id, String firstName, String lastName, int contactNumber, String email, String role) {
        super(id, firstName, lastName, contactNumber, email);
        this.role = role;
    }



  public Employee(){

  }


    // Getter and Setter methods for the role and employeeId
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    // Override methods from the Object class

    /**
     * Determines if this Employee is equal to another object.
     * Equality is based on both the inherited Person fields and the Employee-specific fields.
     *
     * @param o The object to compare with this Employee.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getRole(), employee.getRole());
    }

    /**
     * Generates a hash code for the Employee.
     * Includes hash codes from both the inherited Person fields and the Employee-specific fields.
     *
     * @return A hash code value for the Employee.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRole());
    }

    /**
     * Returns a string representation of the Employee object.
     * Includes details from both the Person superclass and the Employee-specific fields.
     *
     * @return A string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                "} " + super.toString(); // Includes Person details in the string representation
    }
}
