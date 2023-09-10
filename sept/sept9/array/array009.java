package sept.sept9.array;

public class array009 {
    public static void main(String[] args) {
        int [][][] threeArray = new int[2][3][4];
        // x -> 2, 0, 1
        // y -> 3 , 0,1,2
        // z -> 4 , 0, 1, 2,3

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.println(threeArray[i][j][k]);
                }
            }
        }



    }
}
