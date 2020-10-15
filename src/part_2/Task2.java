package part_2;

public class Task2 {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        System.out.println(myMax(1,2,3,4));
    }
    public static int myMax(int a, int b, int c, int d){
        int result=Math.max((Math.min(a,b)),(Math.min(c,d)));
        return result;
    }
}
