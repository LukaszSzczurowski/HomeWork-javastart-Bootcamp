package zajecia04.point;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isFirstQuarter() {
        if ((getX() > 0) && (getY() > 0)) {
            System.out.println("Punkt znajduje się w pierwszej ćwiartce");
        }
        return false;
    }

    public boolean isSecondQuarter() {
        if ((getX() > 0) && (getY() < 0)) {
            System.out.println("Punkt znajduje się w drugiej ćwiartce");
        }
        return false;
    }

    public boolean isThirdQuarter() {
        if ((getX() < 0) && (getY() < 0)) {
            System.out.println("Punkt znajduje się w trzeciej ćwiartce");
        }
        return false;
    }

    public boolean isFourthQuarter() {
        if ((getX() < 0) && (getY() > 0)) {
            System.out.println("Punkt znajduje się w czwartej ćwiartce");
        }
        return false;
    }

    public boolean isPointOnLineX() {
        if (getY() == 0) {
            System.out.println("Punkt znajduje się na osi X");
        }
        return false;
    }

    public boolean isPointOnLineY() {
        if (getX() == 0) {
            System.out.println("Punkt znajduje się na osi Y");
        }
        return false;
    }

    public boolean isPointCenter() {
        if ((getY() == 0) && (getX() == 0)) {
            System.out.println("Punkt znajduje na środku układu współrzędnych");
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
