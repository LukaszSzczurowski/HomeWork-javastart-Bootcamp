package zajecia07;


public class Group {
    public String nameGroup;
    public Teacher teacher;
    public Student[] group = new Student[2];


    public Group(String nameGroup, Teacher teacher, Student[] group) {
        this.nameGroup = nameGroup;
        this.teacher = teacher;
        this.group = group;
    }

    void print() {
        for (Person person : group) {
            person.printInfo();
        }
    }
}
