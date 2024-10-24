import com.sun.source.util.SourcePositions;

public class TestMyCircle {
    public static void main(String[] args){
        //my point
        MyPoint mp1= new MyPoint(6,22);
        System.out.println(mp1);

        MyPoint p1= new MyPoint();
        System.out.println(p1);

        p1.setX(8);
        p1.setY(6);
        System.out.println( "x is: " + p1.getX());
        System.out.println( "y is: " + p1.getY());

        p1.setXY(3, 0);
        System.out.println( p1.getXY()[0]);
        System.out.println( p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2= new MyPoint(0, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        MyCircle m1= new MyCircle( 34,23,25);
        System.out.println(m1);

        MyCircle m2= new MyCircle();
        System.out.println(m2);

        MyCircle m3= new MyCircle(p1, 5);
        System.out.println(m3);
        System.out.println( " radius3: " + m3.getRadius());
        m3.setRadius(10);
        System.out.println( " radius3': " + m3.getRadius());
        System.out.println( " point 3: " + m3.getCenter());
        m3.setCenter(p2);
        System.out.println( " point 3': " + m3.getCenter());
        System.out.println( " x 3': " + m3.getCenterX());
        System.out.println( " y 3': " + m3.getCenterY());
        System.out.println(m3);

        m3.setCenterX(66);
        m3.setCenterY(34);
        m3.setRadius(100);
        System.out.println(m3);

        m2.setCenterX(55);
        m2.setCenterY(44);
        m2.setRadius(98);
        System.out.println(m2);
        int[] op = m2.getCenterXY();
        System.out.println( " x:" + op[0]);
        System.out.println( " y:" + op[1]);
        m2.setCenterXY(op[1] , op[0]);
        System.out.println(m2);

        System.out.println( " Area 1: " + m1.getArea());
        System.out.println( " Circumference: " + m1.getCircumference());
        System.out.println( " Area 2: " + m2.getArea());
        System.out.println( " Circumference: " + m2.getCircumference());
        System.out.println( " Area 3: " + m3.getArea());
        System.out.println( " Circumference: " + m3.getCircumference());

        System.out.println( " distance 1 vs 2: " + m1.distance(m2));
        System.out.println( " distance 2 vs 3: " + m2.distance(m3));
        System.out.println( " distance 1 vs 3: " + m3.distance(m1));


    }
}
