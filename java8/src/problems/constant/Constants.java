package problems.constant;

import problems.function.dto.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    static List<EmployeeEntity> dummyData = new ArrayList<>();

    static {
        EmployeeEntity e1 = new EmployeeEntity(
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123",
                10000d
        );

        EmployeeEntity e2 = new EmployeeEntity(
                "Rintu",
                "Kumar",
                "rintu@gmail.com",
                "ankit@123",
                10000d
        );

        EmployeeEntity e3 = new EmployeeEntity(
                "Deepak",
                "Kumar",
                "deepak@gmail.com",
                "ankit@123",
                10000d
        );

        EmployeeEntity e4 = new EmployeeEntity(
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123",
                10000d
        );

        EmployeeEntity e5 = new EmployeeEntity(
                "Ankit",
                "Srivastava",
                "ankit@gmail.com",
                "ankit@123",
                10000d
        );
        dummyData.add(e1);
        dummyData.add(e2);
        dummyData.add(e3);
    }

    public List<EmployeeEntity> getEmployeeData() {
        return dummyData;
    }
}
