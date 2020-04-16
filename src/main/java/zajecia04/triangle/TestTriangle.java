package zajecia04.triangle;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);

        IsTrueTriangle isTrue = new IsTrueTriangle();
        System.out.println(isTrue.isTrueTriangle(triangle));

    }
}
