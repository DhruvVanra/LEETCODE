class spiralMatrixII59{
    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int num = 1;
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = num;
                num++;
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num;
                num++;
            }

            
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    matrix[endRow][i] = num;
                    num++;
                }
            }

        
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    matrix[i][startCol] = num;
                    num++;
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = generateMatrix(3);
        for(int arr[] : matrix){
            for(int ar : arr){
                System.out.println(ar);
            }
        }
    }


}