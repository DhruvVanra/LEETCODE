class rotate48{
    public static void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length;i++){
            for(int j =i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            int low = 0;
            int high = matrix.length-1;
            while(low<= high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }

}