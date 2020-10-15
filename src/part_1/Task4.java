package part_1;

public class Task4 {
    //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void main(String[] args) {
        System.out.println(newFunction4(123.456));
    }
    public static double newFunction4(double a){
        double b=(a*1000)%1000+(int)a/1000.0;
        return b;
    }
}
