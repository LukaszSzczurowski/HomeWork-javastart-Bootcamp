package zajecia04.triangle;

public class  Triangle {

    private double cathetusA;
    private double cathetusB;
    private double hypotenuseC;

    public Triangle() {
    }

    public Triangle(double cathetusA, double cathetusB, double hypotenuseC) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
        this.hypotenuseC = hypotenuseC;
    }

    public double getCathetusA() {
        return cathetusA;
    }

    public void setCathetusA(double cathetusA) {
        this.cathetusA = cathetusA;
    }

    public double getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(double cathetusB) {
        this.cathetusB = cathetusB;
    }

    public double getHypotenuseC() {
        return hypotenuseC;
    }

    public void setHypotenuseC(double hypotenuseC) {
        this.hypotenuseC = hypotenuseC;
    }
}
