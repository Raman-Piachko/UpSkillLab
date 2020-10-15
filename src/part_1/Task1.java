package part_1;

public class Task1 {
    // Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void main(String[] args) {
        System.out.println(newFunction1(5,5,3));
    }
    public static double newFunction1(double a, double b, double c){
        double result= ((a-3)*(b/2))+c;
        return result;
    }
}
