package zajecia07;

public class Test {
    public static void main(String[] args) {
        Person teacher = new Teacher("Joanna", "Ogólna", "ul.Okólna 4, Olsztyn", 600600600, 4);
        Person student1 = new Student("Kamil", "Kowal", "ul.Wspólna 4, Olsztyn", 400500600, 5);
        Person student2 = new Student("Luizaz", "Bycza", "ul.Duńska 4, Olsztyn", 555666222, 3);
        Group group1 = new Group("Grupa Programowanie", teacher, student1, student2);

        System.out.println(group1.nameGroup);
        group1.print();

        Person teacher2 = new Teacher("Kamil", "Lambnd", "ul.Prosta 33, Olsztyn", 123978755, 1);
        Person student3 = new Student("Ola", "Kotek", "ul.Bystra 14b Olsztyn", 000000003, 3);
        Person student4 = new Student("Luizaz", "Bycza", "ul.Duńska 4, Olsztyn", 555666222, 5);
        Group group2 = new Group("Grupa projektowanie", teacher2, student3, student4);

        System.out.println(group2.nameGroup);
        group2.print();

    }
}
