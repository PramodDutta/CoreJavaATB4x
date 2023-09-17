package sept.sept16;

public class OOP001 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Pramod";
        p.age = 32;

        Person p2 = new Person();
        p2.name = "Amit";

        Person p3 = new Person();

        System.out.println(p.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

    }
}
