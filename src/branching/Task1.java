package branching;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(isItTreangle(45, 45));
        System.out.println(isTriangleRightAngled(45, 45));
    }

    public static boolean isItTreangle(double a, double b) {
        return (180 - a - b > 0);
    }

    public static boolean isTriangleRightAngled(double a, double b) {
        return (180 - a - b == 90);
    }

}
