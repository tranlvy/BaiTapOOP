public class Rectangle {
    private float width, length;
    public Rectangle(){
        this.width=1.0f;
        this.length=1.0f;
    }
    public Rectangle(float length, float width){
        this.width=width;
        this.length=length;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
       this.length=length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width=width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public String toString(){
        return "Rectangle[length="+length+",width="+width+"]";
    }
}
