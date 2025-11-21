import java.util.Arrays;

public class NDArrays {
    public static void main(String[] args) {
        int matrix1[][] = new int[3][4]; // 3 rows and 4 columns
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[0][3] = 4;
        matrix1[1][0] = 5;
        matrix1[1][1] = 6;
        matrix1[1][2] = 7;
        matrix1[1][3] = 8;
        matrix1[2][0] = 9;
        matrix1[2][1] = 10;
        matrix1[2][2] = 11;
        matrix1[2][3] = 12;
        System.out.println("matrix1: ");
        System.out.println(Arrays.deepToString(matrix1)); // use deepToString() for multi-dimensional arrays

        int matrix2[][] = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        };
        System.out.println("matrix2: ");
        System.out.println(Arrays.deepToString(matrix2));

        int threeDArray[][][] = {
            {
                {1, 2}, 
                {3, 4}
            }, 
            {
                {5, 6}, 
                {7, 8}
            }
        };
        System.out.println("threeDArray: ");
        System.out.println(Arrays.deepToString(threeDArray));

        // Creating an array with different number of columns in each row
        int jaggedArray[][] = {
            {1, 2, 3}, 
            {4, 5}, 
            {6, 7, 8, 9}
        };
        System.out.println("jaggedArray: ");
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
