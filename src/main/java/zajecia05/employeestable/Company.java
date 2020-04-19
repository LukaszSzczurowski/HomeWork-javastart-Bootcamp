package zajecia05.employeestable;

import java.sql.Array;

public class Company {

    public static int INDEX = 0;
    public static int LIMIT_EMPLOYEE = 3;

    private Employee[] employees;

    public Company() {
        employees = new Employee[LIMIT_EMPLOYEE];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    void add(Employee emp) {
        if (INDEX < employees.length) {
            employees[INDEX] = emp;
            INDEX++;
        } else {
            System.out.println("Nie mozna dodac juz pracownika. lista pelna");
        }
    }

    Employee get(int index) {
        return employees[index];
    }

}
