package sept.sept23.inheritance.multilevel.e2;

public class Car extends Vehicle{
    public Car(int i ){
        super(i); // Super -> Vehicle
    }

    void carFunc(){
        System.out.println("Car");
    }
}
