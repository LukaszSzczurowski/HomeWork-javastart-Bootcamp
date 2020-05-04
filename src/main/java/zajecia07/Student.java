package zajecia07;

public class Student extends Person {
    private int grade;

    public Student(String name, String lastName, String address, int telophone, int grade) {
        super(name, lastName, address, telophone);
        this.grade = grade;
    }


    public void printInfo(){
        super.printInfo();
        System.out.println(", id studenta: " + grade);
    }
}
