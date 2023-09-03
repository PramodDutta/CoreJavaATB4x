package sept.setp3.ifelse;

public class Lab012 {
    public static void main(String[] args) {

        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        int side1 = 5;
        int side2 = 4;
        int side3 = 3;

        if ( side1== side2 && side2 == side3)  {
            System.out.println("EQ");
        } else if ( side1 == side2 || side1 ==  side3 || side2 == side3 ) {
            System.out.println("ISO");
        }else{
            System.out.println("SCalene");
        }


    }
}
