/**
 * Created by prathmeshjakkanwar on 4/9/17.
 */
public class RotateMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] clockwiseRotateMatrix = rotateMatrixClockWise(matrix);
        printMatrix(clockwiseRotateMatrix);
        System.out.println();
        int[][] antiClockwiseRotateMatrix = rotateMatrixAntiClockWise(matrix);
        printMatrix(antiClockwiseRotateMatrix);
    }

    public static int[][] rotateMatrixClockWise(int[][] matrix) {
        int columns = matrix.length;
        int rows = matrix[0].length;

        // TRANSPOSE
        for (int i=0;i<columns;i++) {
            for (int j=i;j<rows;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // SWAP/MIRROR
        for (int i=0;i<columns;i++) {
            for (int j=0;j<columns/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-1-j];
                matrix[i][columns-1-j] = temp;
            }
        }

        return matrix;
    }

    public static int[][] rotateMatrixAntiClockWise(int[][] matrix) {
        int columns = matrix.length;
        int rows = matrix[0].length;

        // SWAP/MIRROR
        for (int i=0;i<columns;i++) {
            for (int j=0;j<columns/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-1-j];
                matrix[i][columns-1-j] = temp;
            }
        }

        // TRANSPOSE
        for (int i=0;i<columns;i++) {
            for (int j=i;j<rows;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }


    public static void printMatrix(int[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
