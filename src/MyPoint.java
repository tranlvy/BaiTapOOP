public class MyPoint {
    private int x,y;
    public MyPoint(){
       int x=0, y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public static int[] getXY(int x, int y){
        return new int[]{x,y};
        // mảng là một class-> khai báo object->dùng[]
    }
    public void setXY(int x, int y ){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        // Math.pow(a,bậc lũy thừa)
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(this.x-another.x,2)+Math.pow(this.y-another.y,2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.x-0,2)+Math.pow(this.y-0,2));
    }



}
