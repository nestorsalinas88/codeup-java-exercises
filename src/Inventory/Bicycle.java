package Inventory;

public class Bicycle {
   public int candence;
   public int gear;
   public int speed;


//   constructor
    public Bicycle(int startCandence, int startGear, int startSpeed) {
        this.candence = startCandence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setCandence(int newValue) {
        this.candence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }
    public void applyBreak(int decrement) {
        this.speed -= decrement;
    }

}
