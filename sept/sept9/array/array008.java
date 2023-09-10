package sept.sept9.array;

public class array008 {
    public static void main(String[] args) {
        int[] marks = new int[3]; // 0,0,0
        int[] marks2 = {1,2,3}; // 1, 2, 3


        // 2D
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] matrix2 = new int[3][3];
        matrix2[0][1] = 1;
        matrix2[0][2] = 2;
        matrix2[0][3] = 3;
        matrix2[1][1] = 4;
        matrix2[2][2] = 5;
        matrix2[3][3] = 6;
        matrix2[2][1] = 7;
        matrix2[2][2] = 8;
        matrix2[2][3] = 9;




        // print all the elements
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
        }





    }
}
