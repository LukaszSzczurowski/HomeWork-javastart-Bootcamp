package zajecia08.tablewithuniqueobject;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Human[] humans = new Human[3];
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (i != humans.length) {
            System.out.println("Dodaj człowieka numer " + (i + 1));
            Human human = createHuman(sc);
            if (isDuplicate(human, humans)) {
                System.out.println("nowy człowiek dodany do listy");
                humans[i] = human;
                i++;
            } else {
                System.out.println("Taki człowiek już jest w tablicy, dodaj innego");
            }
        }

        printHuman(humans);
    }

    private static void printHuman(Human[] humans) {
        System.out.println("Dodałeś poniższe niedublujące się osoby");
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    private static boolean isDuplicate(Human human, Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            if (human.equals(humans[i])) {
                return false;
            }
        }
        return true;
    }

    private static Human createHuman(Scanner sc) {
        System.out.println("Podaj nazwę: ");
        String name = sc.nextLine();
        System.out.println("Podaj wiek: ");
        int age = sc.nextInt();
        sc.nextLine();
        return new Human(name, age);
    }
}
