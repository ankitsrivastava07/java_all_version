package problems.optional;

import problems.function.dto.EmployeeEntity;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaOptionalExp {

    public List<EmployeeEntity> applyMultipleSorting(List<EmployeeEntity> employeeEntities) {

        return employeeEntities
                .stream()
                .sorted(Comparator
                        .comparingDouble(EmployeeEntity
                                ::getSalary)
                        .thenComparing(EmployeeEntity::getFirstName))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {


        JavaOptionalExp javaOptionalExp = new JavaOptionalExp();
        //javaOptionalExp.applyMultipleSorting();
    }

}
