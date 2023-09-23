package sept.sept23.inheritance.multilevel.e2;

public class Tesla extends Car{

    public Tesla(int i) {
        super(i); // super -> Car?
    }

    void topSpeed(){
        System.out.println("I am Tesla!!");
    }

}
