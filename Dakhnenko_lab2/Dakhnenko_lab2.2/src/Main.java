import java.util.Arrays;

class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Оригинальная матрица:");
        printMatrix(matrix);

        System.out.println("\nПоворот на 90 градусов:");
        printMatrix(rotate90(matrix));

        System.out.println("\nПоворот на 180 градусов:");
        printMatrix(rotate180(matrix));

        System.out.println("\nПоворот на 270 градусов:");
        printMatrix(rotate270(matrix));
    }

    public static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static int[][] rotate180(int[][] matrix) {
        return rotate90(rotate90(matrix));
    }

    public static int[][] rotate270(int[][] matrix) {
        return rotate90(rotate90(rotate90(matrix)));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
