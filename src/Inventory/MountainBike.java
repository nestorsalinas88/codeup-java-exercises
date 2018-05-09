package Soccer;

public class Brand extends Bicycle {

    protected String brand;
    protected double salary;

    public Brand(String brand, double salary){
//        super(name, team, position, attack,defense);
        this.brand = brand;
        this.salary = salary;
    }


    public String getName(){
        return brand + " " + salary;
    }
}
