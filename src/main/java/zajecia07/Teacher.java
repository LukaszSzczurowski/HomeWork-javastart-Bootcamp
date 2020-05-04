package zajecia07;

public class Teacher extends Person {
    private int workDays;

    public Teacher(String name, String lastName, String address, int telophone, int workDays) {
        super(name, lastName, address, telophone);
        this.workDays = workDays;
    }

   public void printInfo(){
        super.printInfo();
       System.out.println(", dni w pracy: " + workDays);
    }
}
