package problems.stream.problems.dto;

public class Employee {

    double salary;
    String firstName;
    String lastName;
    String email;
    String password;

    public Employee(double salary, String firstName, String lastName, String email, String password) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}