package part_2;

public class Task1 {
    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
    // и если да, то будет ли он прямоугольным.
    public static void main(String[] args) {
        checkCorners(45,45);
    }
    public static void checkCorners(double a, double b){
        double result=180-a-b;
        if(result==90){
            System.out.println("It is right triangle");
        }
        else if(result>=0){
            System.out.println("It is triangle");
        }
        else {
            System.out.println("It isn't treangle");
        }

    }
}
