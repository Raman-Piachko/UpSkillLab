package branching;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(testTreangle(120,90));
    }

    public static boolean isItTreangle(double a, double b) {
        return (180 - a - b > 0);
    }

    public static boolean isTriangleRightAngled(double a, double b) {
        return (180 - a - b == 90);
    }

    public static String testTreangle(double a, double b) {
        if (isItTreangle(a, b)) {
            if (isTriangleRightAngled(a, b)) {
                return "It is right treangle";
            } else return "It is treangle, but it i not right treangle";

        }else return "It is not triangle";

    }
}


