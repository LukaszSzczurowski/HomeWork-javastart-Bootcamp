package zajecia03.mathematic;

public class Mathematic {

    void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println("isEven Liczba " + x + " jest parzysta");
        } else {
            System.out.println("isEven Liczba " + x + " jest nieparzysta");
        }
    }

    void isOdd(int x) {
        if (!(x % 2 == 0)) {
            System.out.println("isOdd Liczba " + x + " jest nieparzysta");
        }
        System.out.println("isOdd Liczba " + x + " jest parzysta");
    }

    void circleField(double r) {
        System.out.printf("Pole koła o promieniu %.3f wynosi %.3f %n", r, (r * r * Math.PI));
    }

    void power(int a) {
        System.out.println("Liczba " + a + " podniesiona do kwadratu wynosi: " + (a * a));
    }


}
