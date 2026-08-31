public class MatrixOperations {

    public static int[][] multiplyMatrices(int[][] A, int[][] B)
            throws MatrixMismatchException {

        if (A[0].length != B.length) {
            throw new MatrixMismatchException(
                "Matrix multiplication not possible. " +
                "Columns of Matrix A (" + A[0].length +
                ") must equal rows of Matrix B (" + B.length + ")."
            );
        }

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}