import java.lang.String;
public class Account {
    private int id;
    private double balance=0.0;
    private Customer customer;
    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){

        return customer;
    }
    public double getBalance(){

        return balance;
    }
    public void setBalance( double balance)
    {
        this.balance=balance;
    }
    public String toString(){
        return " " + customer.getName() + "(" + id + ")" + " balance=$" + String.format( "%.2f", balance );
    }
    public String getCustomerName()
    {
        return customer.getName();
    }
    public Account deposit( double amount){ // Tien gui
        balance= balance + amount;
        System.out.printf( " Deposit:$ %.2f%n ", amount);
        return this;        //     TRA VE DOI TUONG HIEN TAI VA TIEP TUC PHUONG THUC
                            //  METHOD CHAINING-> public Account: cho phep tra ve mot doi tuong cua Account
    }
    public Account withdraw( double amount){// rut tien
        if ( balance>= amount){
            this.balance=balance - amount;
            System.out.printf( " Withdraw:$ %.2f%n ", amount);
        }
        else{
            System.out.println( " amount withdraw exceeds the current balance! ");// EXCEED: vuot qua
        }
        return this;//     TRA VE DOI TUONG (TAO BANG NEW TRONG TESTMAIN) HIEN TAI VA TIEP TUC PHUONG THUC
    }
}
