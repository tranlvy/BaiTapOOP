public class Book {
    private String name;
    private double price;
    private int qty=0;
    private Author[] author; // Array Declaration
    public Book(String name, Author[] author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name, Author[] author, double price, int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.author=author;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice( double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return " Book[name=" + name + ",authors={" + author[0] + "," + author[1] + "},price=" + price + ",qty=" + qty + "]" ;
    }
    public String getAuthorNames(){
        return author[0].getName() + "," + author[1].getName();
    }
}
