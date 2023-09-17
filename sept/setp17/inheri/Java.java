package sept.setp17.inheri;
// IS A - Inheritance
public class Java extends Programming {

    String newFeature;
    Java(){

    }

    Java(String feature){
        this.newFeature = feature;
    }

    void printInfoJava(){
        System.out.println("Child Java");
    }



}
