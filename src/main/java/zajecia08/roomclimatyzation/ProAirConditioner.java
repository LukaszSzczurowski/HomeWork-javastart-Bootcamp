package zajecia08.roomclimatyzation;

public class ProAirConditioner extends Climatyzation {


    public ProAirConditioner(int maxCoolerTemperature) {
        super(maxCoolerTemperature);
    }

    public void coolDownPro(Room room) {
        float volumeHelper = (2 / room.getRoomVolume());
        if (room.getActualTemperature() > getMaxCoolerTemperature()) {
            room.setActualTemperature(room.getActualTemperature() - volumeHelper);
        } else {
            System.out.println("maxymalne chłodzenie. Obniżanie temperatury zablokowane");
        }
    }
}
