public class MyPoint {
    private int x, y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX( int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance( int x, int y){
//        return Math.sqrt( Math.pow(x-this.x,2) + Math.pow(y-this.y,2));
        int xDiff=x-this.x;
        int yDiff=y-this.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(MyPoint another){
//        return Math.sqrt(Math.pow(this.x-another.x,2) + Math.pow(this.x-another.y,2));
        int xDiff=this.x-another.x;
        int yDiff=this.y-another.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(){
//        return  Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }


    
}
