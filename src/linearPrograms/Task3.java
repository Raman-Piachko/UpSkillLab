package linearPrograms;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(calculateValue(30, 60));
    }

    public static double calculateValue(double x, double y) {
        double a = x * y;
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(a);
    }
}
