package part_1;

public class Task5 {
    //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void main(String[] args) {
        System.out.println(intervalToHMS(3661));
    }
    public static String intervalToHMS(long interval) {
        int hour = (int) (interval / 3600);
        int min = (int) ((interval - hour * 3600) / 60);
        int sec = (int) (interval - hour * 3600 - min * 60);
        return hour + "ч " + min + "мин " + sec + "с.";
    }
}
