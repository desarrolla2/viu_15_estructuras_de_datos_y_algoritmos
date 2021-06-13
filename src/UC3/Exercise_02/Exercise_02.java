package UC3.Exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        initializeMatrix(matrix);
        printMatrix();
    }

    private static void printMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    System.out.print(i + j + "\t");
                    continue;
                }
                System.out.print(i + j + "\n");
            }
        }
    }

    private static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = i + j;
            }
        }
    }
}
