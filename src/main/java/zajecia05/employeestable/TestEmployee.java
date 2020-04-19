package zajecia05.employeestable;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeesService employeesService = new EmployeesService();
        Employee emp1 = employeesService.createEmploees();

        Company company = new Company();
        company.add(emp1);
        printArray(company.getEmployees());

        Employee emp2 = company.get(0);
        company.add(emp2);
        printArray(company.getEmployees());

        Employee emp3 = company.get(0);
        company.add(emp3);
        printArray(company.getEmployees());

        employeesService.sumSalares(company.getEmployees());
    }

    private static void printArray(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee + "");
        }
    }
}
