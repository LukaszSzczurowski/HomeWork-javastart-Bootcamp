package zajecia05.employeestable;

import java.util.Arrays;

public class Company {


    public static final int LIMIT_EMPLOYEE = 3;

    private Employee[] employees;
    private int index;

    public Company() {
        employees = new Employee[LIMIT_EMPLOYEE];
        index = 0;
    }

    public Employee[] getEmployees() {
        return employees;
    }


    void add(Employee emp) {
        if (index < employees.length) {
            employees[index] = emp;
            index++;
        } else {
            System.out.println("Nie mozna dodac juz pracownika. lista pelna");
        }
    }

    Employee get(int index) {
        return employees[index];
    }

   void printArray() {
        for (Employee employee : employees) {
            System.out.println(employee + "");
        }
    }
}
