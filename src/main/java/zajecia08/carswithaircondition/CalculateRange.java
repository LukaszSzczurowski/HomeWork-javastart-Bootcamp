package zajecia08.carswithaircondition;

public class CalculateRange {

    float rangeCar(Vehicle car1) {
        Car car = (Car)car1;
        float rangeCar;
        if (car.isConditionAir()) {
            car.setMediumFuelConsumption((float) (car.getMediumFuelConsumption() + 0.8));
            rangeCar = (car.getCapacityTank() / car.getMediumFuelConsumption()) * 100;
            return rangeCar;
        } else {
            rangeCar = (car.getCapacityTank() / car.getMediumFuelConsumption()) * 100;
            return rangeCar;
        }
    }

    float rangeTruck(Vehicle truck1) {
        Truck truck = (Truck) truck1;
        float rangeTruck;
        if ((truck.isConditionAir())) {
            truck.setMediumFuelConsumption((float) (truck.getMediumFuelConsumption() + 1.6 + (truck.getWeightCargo() * 0.005)));
            rangeTruck = (truck.getCapacityTank() / truck.getMediumFuelConsumption()) * 100;
            return rangeTruck;
        } else {
            rangeTruck = (float) ((truck.getCapacityTank() / (truck.getMediumFuelConsumption() + (truck.getWeightCargo() * 0.005))) * 100);
            return rangeTruck;
        }
    }


}
