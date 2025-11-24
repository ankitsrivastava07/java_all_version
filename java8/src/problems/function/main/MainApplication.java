package problems.function.main;

import problems.function.CustomFunction;
import problems.function.dto.EmployeeDto;
import problems.function.dto.EmployeeEntity;
import problems.lambda.Calculator;
import problems.lambda.MessageService;
import problems.function.dto.MailDto;

import java.util.function.Predicate;

public class MainApplication {

    public static void main(String[] args) {

        /*
           Calculator, calculate two number sum
        * */
        Calculator c = (n1, n2) -> n1 + n2;
        System.out.println(c.calculate(10, 20));

        /*
         * Send Message to the mail service
         * */
        MessageService messageService = (mailDto) -> {
            /*
               Pattern Matching Java 17 features
            * */
            switch (mailDto) {
                case MailDto mailDto1 -> System.out.println("MailDto " + mailDto1);

                default -> throw new IllegalStateException("Unexpected value: " + mailDto);
            }

            System.out.println(mailDto);
        };

        MailDto mailDto = new MailDto();
        messageService.sendMessage(mailDto);

        /*
        Predicate Example  Even or Odd number check
        * */
        Predicate<Integer> predicate = (num) -> num % 2 == 0;

        Integer num = 9;
        System.out.println(predicate.test(num));

        EmployeeEntity employeeEntity = new EmployeeEntity(
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "abc",
                12000d);

        CustomFunction<EmployeeEntity, EmployeeDto> customFunction = (empEntity) -> {

            EmployeeDto e1 = new EmployeeDto();
            e1.setFirstName(empEntity.getFirstName());
            e1.setLastName(empEntity.getLastName());
            e1.setMail(empEntity.getEmail());
            e1.setPassword(empEntity.getPassword());
            return e1;
        };

        System.out.println(customFunction.apply(employeeEntity));

    }
}
