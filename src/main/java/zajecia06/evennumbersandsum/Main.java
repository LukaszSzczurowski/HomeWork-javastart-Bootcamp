package zajecia06.evennumbersandsum;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.printf(i + ";");
            sum += i;
        }
        System.out.println("Suma powyższych liczb wynosi :" + sum);
    }
}
