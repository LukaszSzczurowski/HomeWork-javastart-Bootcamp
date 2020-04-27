package zajecia07;


public class Group {
    public String nameGroup;
    public Person[] group = new Person[3];


    public Group(String nameGroup, Person teacher, Person student1, Person student2) {
        this.nameGroup = nameGroup;
        this.group[0] = teacher;
        this.group[1] = student1;
        this.group[2] = student2;
    }

    void print() {
        for (Person person : group) {
            person.printInfo();
        }
    }
}
