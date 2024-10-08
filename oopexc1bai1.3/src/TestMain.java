public class TestMain {
    public static void main(String[] args){
        Rectangle r1= new Rectangle(1.2f,3.4f);
        System.out.println(r1);
        Rectangle r2= new Rectangle();
        System.out.println(r2);
        Rectangle r3= new Rectangle(5.6f,7.8f);
        System.out.println(r3);
        System.out.println( " length is: " + r3.getLength());
        System.out.println( " width is: " + r3.getWidth());
        System.out.printf( " area is: %.2f%n", r3.getArea());
        System.out.printf( " perimeter is: %.2f%n", r3.getPerimeter());
    }

}
