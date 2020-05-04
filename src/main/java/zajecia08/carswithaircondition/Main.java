package zajecia08.carswithaircondition;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[9];
        vehicles[0] = new Car("fiat", 30, 10, false);
        vehicles[1] = new Car("ford", 80, 5, false);
        vehicles[2] = new Car("citroen", 70, 5, false);
        vehicles[3] = new Car("skoda", 60, 5, false);
        vehicles[4] = new Car("renault", 50, 5, false);
        vehicles[5] = new Truck("Daf", 1000, 20, false, 500);
        vehicles[6] = new Truck("volvo", 1000, 25, false, 500);
        vehicles[7] = new Truck("scania", 1000, 15, false, 500);
        vehicles[8] = new Truck("marcedes", 50, 30, false, 0);

        CalculateRange calculate = new CalculateRange();

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Car)
                System.out.println(vehicles[i].info() + ", zasięg: " + calculate.rangeCar(vehicles[i]) + " km");
        }


    }
}
