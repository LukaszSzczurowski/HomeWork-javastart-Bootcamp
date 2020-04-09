package zajecia03.telewizor;

public class Televisor {

    boolean isOn;

    public Televisor() {
        isOn = false;
    }

    void turnOff(){
        this.isOn = false;
    }
    void turnOn(){
        this.isOn = true;
    }
    void showStatus(){
        System.out.println("Czy telewizor jest włączony: " + isOn);
    }

}
