package part_1;

public class Task2 {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main(String[] args) {
        System.out.println(newFunction2(3,5,2));
    }
    public static double newFunction2(double a, double b, double c){
        double d=b*b+4*a*c;
        double result=(b+Math.sqrt(d))/b-Math.pow(a,3)*c+Math.pow(c,-2);
        return result;
    }
}
