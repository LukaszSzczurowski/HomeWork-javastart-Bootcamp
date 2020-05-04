package zajecia08.carswithaircondition;

public class Car extends Vehicle {
    private boolean isConditionAir;

    public Car(String name, float capacityTank, float mediumFuelConsumption, boolean isConditionAir) {
        super(name, capacityTank, mediumFuelConsumption);
        this.isConditionAir = isConditionAir;
    }

    public boolean isConditionAir() {
        return isConditionAir;
    }

    public void setConditionAir(boolean conditionair) {
        isConditionAir = conditionair;
    }


    @Override
    String info() {
        return super.info() + " klimatyzacja włączona: " + isConditionAir;
    }
}

