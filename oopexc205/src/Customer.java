public class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name, int discount){ //  DISCOUNT LA THAM SO TU DO
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender='m';
    }
    public String toString(){
        return " " +  name + "(" + id + ")";
    }
}
