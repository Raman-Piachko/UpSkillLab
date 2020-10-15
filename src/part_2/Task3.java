package part_2;

public class Task3 {
    public static void main(String[] args) {
        Point point1= new Point(1,2);
        Point point2=new Point(1,3);
        Point point3=new Point(1,4);
        System.out.println(Point.pointsOnLine(point1,point2,point3));
    }
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public static boolean pointsOnLine(Point one, Point two, Point three){
            boolean b = false;
            if(one.x==two.x&&one.x==three.x){b=true;}
            return b;
        }
    }

}
