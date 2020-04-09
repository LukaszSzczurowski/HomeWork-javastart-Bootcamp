package zajecia03.telewizor;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.showStatus();
        System.out.println("Włączam telewizor");
        televisor.turnOn();
        televisor.showStatus();
        System.out.println("Wyłączam telewizor");
        televisor.turnOff();
        televisor.showStatus();
    }
}
