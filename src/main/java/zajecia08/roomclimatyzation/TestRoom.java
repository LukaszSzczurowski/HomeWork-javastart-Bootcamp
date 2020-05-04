package zajecia08.roomclimatyzation;

public class TestRoom {
    public static void main(String[] args) {

        Climatyzation basicAir = new BasicAirConditioner(16);
        Climatyzation proAir = new ProAirConditioner(16);

        Room room1 = new Room("kuchnia", 10, 18);
        Room room2 = new Room("salon", 10, 18);

        room1.addAirCondition(basicAir);
        System.out.println(room1);
        ((BasicAirConditioner)basicAir).coolDownBasic(room1);
        ((BasicAirConditioner)basicAir).coolDownBasic(room1);
        System.out.println(room1);

        room2.addAirCondition(proAir);
        System.out.println(room2);
        ((ProAirConditioner)proAir).coolDownPro(room2);
        ((ProAirConditioner)proAir).coolDownPro(room2);
        System.out.println(room2);

    }
}
