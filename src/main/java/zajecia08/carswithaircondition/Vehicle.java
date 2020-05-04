package zajecia08.carswithaircondition;

public class Vehicle {
    private String name;
    private float capacityTank;
    private float mediumFuelConsumption;

    public Vehicle(String name, float capacityTank, float mediumFuelConsumption) {
        this.name = name;
        this.capacityTank = capacityTank;
        this.mediumFuelConsumption = mediumFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCapacityTank() {
        return capacityTank;
    }

    public void setCapacityTank(float capacityTank) {
        this.capacityTank = capacityTank;
    }

    public float getMediumFuelConsumption() {
        return mediumFuelConsumption;
    }

    public void setMediumFuelConsumption(float mediumFuelConsumption) {
        this.mediumFuelConsumption = mediumFuelConsumption;
    }

    String info() {
        return "Marka: " + name + ",pojemność: " + capacityTank + " ,średinie spalanie: " + mediumFuelConsumption;
    }
}
