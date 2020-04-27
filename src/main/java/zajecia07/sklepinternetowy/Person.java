package zajecia07.sklepinternetowy;

public class Person {
    public String contactDetails;

    public Person(String contactDetails) {
        this.contactDetails = contactDetails;
    }


    void printInfo(){
        System.out.printf("Dane kontaktowe: " + contactDetails);
    }
}
