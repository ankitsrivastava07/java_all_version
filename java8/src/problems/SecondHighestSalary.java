package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SecondHighestSalary {

    public static Employee secondHighestSalary(List<Employee> employes) {

        return employes
                .stream()
                .sorted(Comparator
                        .comparingDouble(Employee
                                ::getSalary)
                        .reversed())
                .skip(1)
                .findFirst()
                .get();

    }

    public static void main(String[] args) {
        Employee e1 = new Employee(3550001d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123");

        Employee e2 = new Employee(3550d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123");

        Employee e3 = new Employee(3550d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123");

        Employee e4 = new Employee(35500d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123");


        Employee e5 = new Employee(3555000d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);
        Employee emp = SecondHighestSalary.secondHighestSalary(employees);
        System.out.println("First Name " + emp.getFirstName() + " and salary is " + emp.getSalary());
    }
}

class Employee {

    double salary;
    String firstName;
    String lastName;
    String email;
    String password;

    Employee(double salary, String firstName, String lastName, String email, String password) {
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