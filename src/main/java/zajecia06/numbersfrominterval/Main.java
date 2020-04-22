package zajecia06.numbersfrominterval;

public class Main {


    public static void main(String[] args) {
        double numbers = 0.0;
        while (numbers <= 3.1) {

            System.out.printf("%.1f ; " , numbers);
            numbers = (numbers+ 0.1);

        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        numbers =0.0;
        do {
            System.out.printf("%.1f ; " , numbers);
            numbers = (numbers+ 0.1);

        }while (numbers <= 3.1);
    }
}
