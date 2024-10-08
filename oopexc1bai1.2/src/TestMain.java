public class TestMain {
    public static void main(String[] args){
        Circle c1= new Circle(1.1);
        System.out.println(c1);
        Circle c2= new Circle();
        System.out.println(c2);
        Circle c3= new Circle(2.2);
        System.out.println(c3);
        System.out.println( "radius is: " + c3.getRadius());
        System.out.printf( "area is:  %.2f%n", c3.getArea());
        System.out.printf( "circumference is:  %.2f%n", c3.getCircumference());
    }
}
