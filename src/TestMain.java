public class TestMain {
    public static void main(String[] args){
        MyPoint p1=new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x là: " + p1.getX());
        System.out.println("y la: " + p1.getY());
        p1.setXY(3,0);
        System.out.println(p1.getXY()[0]);


        MyPoint p2=new MyPoint(0,4);

    }
}
