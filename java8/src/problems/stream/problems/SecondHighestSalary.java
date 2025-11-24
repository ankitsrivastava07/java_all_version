package problems.stream.problems;

import problems.stream.problems.dto.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

    public static Employee secondHighestSalary(List<Employee> employees) {
        return employees
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
        Employee e1 = new Employee(10000d,
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123"
        );

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

