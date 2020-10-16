package linearPrograms;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(transformSeconds(3661));
    }

    public static String transformSeconds(long seconds) {
        int hour = (int) (seconds / 3600);
        int min = (int) ((seconds - hour * 3600) / 60);
        int sec = (int) (seconds - hour * 3600 - min * 60);
        return String.format("%dч %dмин %dс.", hour, min, sec);
    }
}
