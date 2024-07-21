package CrackYourPlacementDay1;

public class SetMatrixZero {
    static class Solution {
        private int[] array1;
        private int[] array2;

        public void setZeroes(int[][] matrix) {
            int numRows = matrix.length;
            int numCols = matrix[0].length;

            array1 = new int[numRows * numCols];
            array2 = new int[numRows * numCols];
            int index = 0;
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    if (matrix[i][j] == 0) {
                        array1[index] = i;
                        array2[index] = j;
                        index++;
                    }
                }
            }

            array(array1, array2, index, numRows, numCols, matrix);
        }

        public void array(int[] array1, int[] array2, int size, int numRows, int numCols, int[][] matrix) {
            for (int i = 0; i < size; i++) {
                overWriteZero(array1[i], array2[i], numRows, numCols, matrix);
            }
        }

        public void overWriteZero(int x, int y, int numRows, int numCols, int[][] matrix) {
            for (int i = 0; i < numCols; i++) {
                matrix[x][i] = 0;
            }
            for (int i = 0; i < numRows; i++) {
                matrix[i][y] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        solution.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Output should be:
        // 1 0 1
        // 0 0 0
        // 1 0 1
    }
}
