package zajecia08.uniquestrings;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String index = null;
            String writeString;
            System.out.println("Start");

            while (!(writeString = scanner.nextLine()).equals(index)){
                index = writeString;

            }
            System.out.println("Stop");
        }
}
