package zajecia08.carswithaircondition;

public class Truck extends Car {
    private double weightCargo;

    public Truck(String name, float capacityTank, float mediumFuelConsumption, boolean isConditionAir, double weightCargo) {
        super(name, capacityTank, mediumFuelConsumption, isConditionAir);
        this.weightCargo = weightCargo;
    }

    public double getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }

    @Override
    public void setConditionAir(boolean conditionair) {
        super.setConditionAir(conditionair);
    }

    @Override
    String info() {
        return super.info() + " waga ładunku: " + weightCargo;
    }
}
