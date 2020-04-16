package zajecia04.point;

public class Section2 {

    private Section section;

    public Section2() {
    }

    public Section2(Section section) {
        this.section = section;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public double countSectionWhenSection(Section section) {
        double countSection;
        countSection = Math.sqrt(Math.pow(section.getPoint2().getX() - section.getPoint1().getX(), 2) + Math.pow(section.getPoint2().getY() - section.getPoint1().getY(), 2));
        return countSection;
    }

    public boolean isCanBuildTriange(Point pointA, Point pointB, Point pointC) {
        double cathetusAC = Math.sqrt(Math.pow(pointC.getX() - pointA.getX(), 2));
        double cathetusBC = Math.sqrt(Math.pow(pointC.getY() - pointB.getY(), 2));
        double hypotenuseAB = section.countSectionWhenPoints(pointA, pointB);
        if ((hypotenuseAB == cathetusAC + cathetusBC)) {
            System.out.println("Trójkąt może zostać zbudowany z punktów: " + pointA + "," + pointB + "," + pointC);
        }
        System.out.println("Nie da się zbudować trójkąta");
        return false;
    }

}
