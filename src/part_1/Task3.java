package part_1;

public class Task3 {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main(String[] args) {
        System.out.println(newFunction3(30,60));

    }
    public static double newFunction3(int x, int y){
        double a=x*y;
        double result=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(a);
        return result;
    }
}
