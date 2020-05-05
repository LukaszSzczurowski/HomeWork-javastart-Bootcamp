package zajecia08.carswithaircondition;

public class Vehicle {
    private String name;
    private double capacityTank;
    private double mediumFuelConsumption;

    public Vehicle(String name, double capacityTank, double mediumFuelConsumption) {
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

    public double getCapacityTank() {
        return capacityTank;
    }

    public void setCapacityTank(double capacityTank) {
        this.capacityTank = capacityTank;
    }

    public double getMediumFuelConsumption() {
        return mediumFuelConsumption;
    }

    public void setMediumFuelConsumption(double mediumFuelConsumption) {
        this.mediumFuelConsumption = mediumFuelConsumption;
    }

    String info() {
        return String.format("Marka: %s ,pojemność: %.2f ,średinie spalanie: %.2f" , name ,capacityTank ,mediumFuelConsumption);
    }
}
