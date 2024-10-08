public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + ", color of " + c1.getColor() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0, "purple");
        System.out.println("The circle has radius of " + c2.getRadius() + ", color of " + c2.getColor() + " and area of " + c2.getArea());
        Circle c3 = new Circle(23, "blue");
        System.out.println("The circle has radius of " + c3.getRadius() + " color of " + c3.getColor() + " and area of " + c3.getArea());
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());
        System.out.println("area is: " + c4.getArea());
        System.out.println(c1.toString());
        Circle c6 = new Circle(6.6,"yellow");
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);
    }
}
