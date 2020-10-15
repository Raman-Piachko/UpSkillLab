package part_1;

public class Task6 {
    //Для данной области составить линейную программу, которая печатает true, если точка
    // с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
    public static void main(String[] args) {
        System.out.println(checkPoint(3,3));
    }
    public static boolean checkPoint(int x, int y){
        boolean bool;
        if((x>=-4&&x<=4)&&(y>=-3&&y<=0)||(x>=-2&&x<=2)&&(y>=0&&y<=4)){
        bool=true;
        }
        else {bool=false;}
        return bool;
    }
}
