package sept.sept23.Abs.Abs.ex1.example;

public class Abs004 {
    public static void main(String[] args) {

    }
}

abstract class Film{
    String name;
    Film(String fName){
        this.name = fName;
    }

    {
        System.out.println("IIB");
    }
    void show(){
        System.out.println(this.name);
    }
}

class ChildFilm extends Film{

    ChildFilm(String fName) {
        super(fName);
    }
}


