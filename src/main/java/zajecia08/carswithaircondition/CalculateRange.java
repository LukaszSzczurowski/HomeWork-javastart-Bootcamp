package zajecia08.carswithaircondition;

public class CalculateRange {

    double rangeCar(Vehicle car1) {
        Car car = (Car)car1;
        double rangeCar;
        if (car.isConditionAir()) {
            car.setMediumFuelConsumption(car.getMediumFuelConsumption() + 0.8);
            rangeCar = (car.getCapacityTank() / car.getMediumFuelConsumption()) * 100;
            return rangeCar;
        } else {
            rangeCar = (car.getCapacityTank() / car.getMediumFuelConsumption()) * 100;
            return rangeCar;
        }
    }

    double rangeTruck(Vehicle truck1) {
        Truck truck = (Truck) truck1;
        double rangeTruck;
        if ((truck.isConditionAir())) {
            truck.setMediumFuelConsumption((truck.getMediumFuelConsumption() + 1.6 + (truck.getWeightCargo() * 0.005)));
            rangeTruck = (truck.getCapacityTank() / truck.getMediumFuelConsumption()) * 100;
            return rangeTruck;
        } else {
            rangeTruck = ((truck.getCapacityTank() / (truck.getMediumFuelConsumption() + (truck.getWeightCargo() * 0.005 * 100))));
            return rangeTruck;
        }
    }


}
