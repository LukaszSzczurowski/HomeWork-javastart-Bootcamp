package zajecia04.climaroom;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Room {

    private static final int CRITICAL_TEMP = 16;
    private static final int BORDER_VOLUME = 40;

    private double volume;
    private double fieldRoom;
    private double actualTemperature;
    private boolean isAirConditioning;
    private double efficiencyAirConditioning;

    public Room() {
    }

    public Room(double volume, double fieldRoom, double actualTemperature, boolean isAirConditioning, double efficiencyAirConditioning) {
        this.volume = volume;
        this.fieldRoom = fieldRoom;
        this.actualTemperature = actualTemperature;
        this.isAirConditioning = isAirConditioning;
        this.efficiencyAirConditioning = efficiencyAirConditioning;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFieldRoom() {
        return fieldRoom;
    }

    public void setFieldRoom(double fieldRoom) {
        this.fieldRoom = fieldRoom;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    public double getEfficiencyAirConditioning() {
        return efficiencyAirConditioning;
    }

    public void setEfficiencyAirConditioning(double efficiencyAirConditioning) {
        this.efficiencyAirConditioning = efficiencyAirConditioning;
    }

    public boolean decreaseTemp() {
        if ((isAirConditioning) && (getActualTemperature() > CRITICAL_TEMP) && (getVolume() > BORDER_VOLUME)) {
            setActualTemperature(getActualTemperature() - (1 * 0.5 * getEfficiencyAirConditioning()));
        } else if ((isAirConditioning) && (getActualTemperature() > CRITICAL_TEMP) && (getVolume() < BORDER_VOLUME)) {
            setActualTemperature(getActualTemperature() - (1 * getEfficiencyAirConditioning()));
        }
        return false;
    }

    @Override
    public String toString() {
        return "W pokoju o powierzchi: " + getFieldRoom() + " i kubaturze " + getVolume() +
                ", aktualnie jest: " + getActualTemperature() + " stopni Celsjusza przy wydajności klimatyzatora: " +
                (getEfficiencyAirConditioning() * 100) + "%";
    }
}
