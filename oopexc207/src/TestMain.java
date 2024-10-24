public class TestMain {
    public static void main(String[] args){
        MyLine m1= new MyLine( 6,8,5,3);
        m1.getBegin();
        m1.getEnd();
        System.out.println(m1);
        m1.setBeginX(32);
        m1.setBeginY(65);
        m1.setEndX(12);
        m1.setEndY(89);
        System.out.println(m1);
        System.out.println( "x1: " +m1.getBeginX());
        System.out.println( "y1: " +m1.getBeginY());
        System.out.println( "x2: " +m1.getEndX());
        System.out.println( "y2: " +m1.getEndY());
        m1.setBeginXY(43,88);
        System.out.println("Y1: " + m1.getBeginXY()[1]);
        System.out.println("X1: " + m1.getBeginXY()[0]);
        m1.setEndXY(22,24);
        System.out.println("Y2: " + m1.getEndXY()[1]);
        System.out.println("X2: " + m1.getEndXY()[0]);
        System.out.printf( "%.2f%n", + m1.getLength());
        System.out.println(m1);
        double angle= m1.getGradient();
        System.out.printf( "%.2f%n", + angle);

    }
}
