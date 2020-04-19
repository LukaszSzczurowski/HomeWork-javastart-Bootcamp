package zajecia05.employeestable;

import java.util.Scanner;

public class EmployeesService {

    Scanner scanner = new Scanner(System.in);

    void sumSalares(Employee[] tab) {
        double sum = 0;
        for (Employee salary : tab) {
            sum += salary.getSalary();
        }
        System.out.println("Na wyplaty trzeba przeznaczyw tym miesiacu: " + sum + " zl");
    }

    Employee createEmploees() {
            System.out.println("Podaj imie pracownika: ");
            String name = scanner.nextLine();
            System.out.println("Podaj nazwisko pracownika: ");
            String lastname = scanner.nextLine();
            System.out.println("Podaj wypate pracownika: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            return new Employee(name, lastname, salary);
    }
}
