package zajecia08.roomclimatyzation;

public class BasicAirConditioner extends Climatyzation{


    public BasicAirConditioner(int maxCoolerTemperature) {
        super(maxCoolerTemperature);
    }

    public void coolDownBasic(Room room) {
        float volumeHelper = (1 / room.getRoomVolume());
        if (room.getActualTemperature() > getMaxCoolerTemperature()) {
            room.setActualTemperature(room.getActualTemperature() - volumeHelper);
        } else {
            System.out.println("maxymalne chłodzenie. Obniżanie temperatury zablokowane");
        }
    }
}
