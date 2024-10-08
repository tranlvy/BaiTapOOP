public class Employee {
    private int id, salary;
    private String firstName, lastName;
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=8;
        this.salary=2500;
        this.firstName= "Peter";
        this.lastName= "Tan";
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary+salary*percent/100;
    }
    public String toString(){
        return " Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}
