package linearPrograms;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(isPointInPlane(1, 1));
    }

    public static boolean isPointInPlane(int x, int y) {
        return (x >= -4 && x <= 4) && (y >= -3 && y <= 0) || (x >= -2 && x <= 2) && (y >= 0 && y <= 4);
    }
}
