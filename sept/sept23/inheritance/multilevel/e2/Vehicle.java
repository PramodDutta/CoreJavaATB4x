package sept.sept23.inheritance.multilevel.e2;

public class Vehicle {
    int seats;
    String engineType;
    int speed;

    Vehicle(int speed){
        this.speed = speed;
    }

    void topSpeed(){
        System.out.println(" Top Speed" +  this.speed);
    }
}
