package zajecia06.reversequestions;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static final int MAX_ELEMENT_TABLE = 5;

    public static void main(String[] args) {
        System.out.println("Podaj 5 imion: ");
        String namesTable[] = new String[MAX_ELEMENT_TABLE];

        readNames(namesTable);
        printReverseTable(namesTable);


    }

    private static void readNames(String[] namesTable) {
        for (int i = 0; i < namesTable.length; i++) {
            namesTable[namesTable.length - i - 1] = scanner.nextLine();
        }
    }

    private static void printReverseTable(String[] namesTable) {
        for (String name : namesTable) {
            System.out.println("Cześć " + name);
        }
    }
}
