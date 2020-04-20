package zajecia05.employeestable;

import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeesService employeesService = new EmployeesService();
        Employee emp1 = employeesService.createEmploees();

        Company company = new Company();
        company.add(emp1);
        company.printArray();

        Employee emp2 = company.get(0);
        company.add(emp2);
        company.printArray();

        Employee emp3 = company.get(0);
        company.add(emp3);
        company.printArray();

        employeesService.sumSalares(company.getEmployees());
    }


}
