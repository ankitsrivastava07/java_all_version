package problems.function.dto;

public class EmployeeEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Double salary;

    private Integer age;

    public EmployeeEntity(String firstName,
                          String lastName,
                          String email,
                          String password,
                          Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }
}
