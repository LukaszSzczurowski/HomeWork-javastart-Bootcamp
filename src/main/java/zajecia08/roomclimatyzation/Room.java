package zajecia08.roomclimatyzation;

public class Room {
    private String name;
    private float roomVolume;
    private float actualTemperature;
    private Climatyzation clima;

    public Room(String name, float roomVolume, float actualTemperature) {
        this.name = name;
        this.roomVolume = roomVolume;
        this.actualTemperature = actualTemperature;
    }

    public Climatyzation getClima() {
        return clima;
    }

    public void setClima(Climatyzation clima) {
        this.clima = clima;
    }

    public String getIName() {
        return name;
    }

    public void setId(String name) {
        this.name = name;
    }

    public float getRoomVolume() {
        return roomVolume;
    }

    public void setRoomVolume(float roomVolume) {
        this.roomVolume = roomVolume;
    }

    public float getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(float actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public void addAirCondition(Climatyzation climatyzation){
        setClima(climatyzation);
    }

    @Override
    public String toString() {
        return String.format("W Room: %s , actualTemperature= %.2f" ,name,actualTemperature);
    }
}
