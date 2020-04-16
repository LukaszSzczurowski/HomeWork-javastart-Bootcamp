package zajecia04.point;

public class TestPoint {
    public static void main(String[] args) {

        Point point1 = new Point(-4.0, 1.0);
        System.out.println(point1);
        point1.isFirstQuarter();
        point1.isSecondQuarter();
        point1.isThirdQuarter();
        point1.isFourthQuarter();
        point1.isPointCenter();
        point1.isPointOnLineX();
        point1.isPointOnLineY();

        Point point2 = new Point(5, 3);

        Section section = new Section(point1, point2);
        double sectionLength = section.countSectionWhenPoints(point1, point2);
        System.out.printf("Odcinek między punktam (%.2f;%.2f) i (%.2f;%.2f) ma długość  %.2f %n",
                point1.getX(), point1.getY(), point2.getX(), point2.getY(), sectionLength);

        Section2 section2 = new Section2(section);
        double section2Length = section2.countSectionWhenSection(section);
        System.out.printf("Odcinek ma długość  %.2f %n", section2Length);

        Point point3 = new Point(10,-2);
        section2.isCanBuildTriange(point1,point2,point3);

    }
}
