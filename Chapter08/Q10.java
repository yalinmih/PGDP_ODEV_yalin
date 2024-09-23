package odevler.chapter02.Chapter08;

public class Q10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        int rowIndex = -1;
        int maxRowCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                rowIndex = i;
            }
        }

        int colIndex = -1;
        int maxColCount = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int colCount = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                colIndex = i;
            }
        }
        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The largest column index: " + colIndex);
    }
}

