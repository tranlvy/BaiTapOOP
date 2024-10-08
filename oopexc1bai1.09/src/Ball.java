public class Ball {
    private float x,y,xDelta,yDelta;
    private int radius;
    public Ball(float x, float y, int radius, float speed, float directionInDegrees){
        this.x=x;
        this.y=y;
        this.radius=radius;
        // this.xDelta=xDelta;
        //this.yDelta=yDelta;
        double radian=Math.toRadians(directionInDegrees);
        this.xDelta=(float)(speed*Math.cos(radian));
        this.yDelta=(float)(speed*Math.sin(radian));
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    public void reflectVertical(){
        yDelta=-yDelta;
    }
    public String toString () {
        return " Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
