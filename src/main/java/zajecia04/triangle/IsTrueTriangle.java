package zajecia04.triangle;

public class IsTrueTriangle {

    public boolean isTrueTriangle(Triangle triangle) {
        if ((Math.pow(triangle.getCathetusA(), 2)) + (Math.pow(triangle.getCathetusB(), 2))
                == (Math.pow(triangle.getHypotenuseC(), 2))) {
        }
        return false;
    }

    //    StringBuilder builder = new StringBuilder();

//    public void isTrueTriangle(Triangle triangle) {
//        if ((Math.pow(triangle.getCathetusA(), 2)) + (Math.pow(triangle.getCathetusB(), 2))
//                == (Math.pow(triangle.getHypotenuseC(), 2))) {
//
//            showInfoTrue(triangle);
//        } else {
//            showInfoFalse(triangle);
//        }
//
//    }
//
//    private void showInfoFalse(Triangle triangle) {
//        builder.append("Trójkąt o przyprostokątnych: " + triangle.getCathetusA() + " i " + triangle.getCathetusB() + "\n");
//        builder.append(" i przeciwprostokątnej: " + triangle.getHypotenuseC() + " nie jest prostokątny");
//        String show = builder.toString();
//        System.out.println(show);
//    }
//
//    private void showInfoTrue(Triangle triangle) {
//        builder.append("Trójkąt o przyprostokątnych: " + triangle.getCathetusA() + " i " + triangle.getCathetusB() + "\n");
//        builder.append(" i przeciwprostokątnej: " + triangle.getHypotenuseC() + " jest prostokątny");
//        String show = builder.toString();
//        System.out.println(show);
//    }
}
