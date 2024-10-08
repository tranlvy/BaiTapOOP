public class TestMain {
    public static void main(String[] args){
        Ball ball= new Ball(1.1f, 2.2f, 10,3.3f,4.4f);
        System.out.println(ball);
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);
        System.out.println( " x is: " + ball.getX());
        System.out.println( " y is: " + ball.getY());
        System.out.println( " radius is: " + ball.getRadius());
        System.out.println( " xDelta: " + ball.getXDelta());
        System.out.println( " yDelta: " + ball.getYDelta());
        float xMin=0.0f;
        float xMax=100.0f;
        float yMin=0.0f;
        float yMax=50.0f;
        for(int i=1;i<15;i++){
           ball.move();
           System.out.println(ball);
           float xNew=ball.getX(); // gia tri x thay doi tu lan 1 den 15
           float yNew=ball.getY(); // gia tri y thay doi tu lan 1 den 15
           int radius=ball.getRadius();
           if((xNew+radius)>xMax || (xNew-radius)<xMin){ //  toa do  diem xa nhat và gan nhat cua cua bong tren trục hoành
               ball.reflectHorizontal();
           }
           if((yNew+radius)>yMax || (yNew-radius)<yMin){ // toa do diem xa nhat và gan nhat cua bóng tren truc tung
               ball.reflectVertical();
           }
        }

    }
}
