import java.util.*;
class totalNQueens52{
    public static int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];
        int row =0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '.';
            }
        }
        nqueen(board, row, ans);
        return  ans.size();
    }

    public static void nqueen(char board[][] , int row , List<List<String>> ans){
        if(row == board.length){
            printBoard(board , ans);
            return;
        }

        for(int j =0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueen(board, row+1,ans);
                board[row][j] = '.';
            }
        }

    }

    public static void printBoard(char board[][],List<List<String>> ans){
        List<String> temp = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            String str = "";
            for(int j =0;j<board.length;j++){
                str+=board[i][j];
            }
            temp.add(str);
        }
        ans.add(temp);
    }


    public static boolean isSafe(char board[][], int row ,int col){
        //vertical up 
        for(int i = row-1;i>=0;i--){
            if(board[i][col] =='Q'){
                return false;
            }
        }

        // dig left up
        for(int i = row-1,j = col -1; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // dig right up
        for(int i = row-1,j = col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int ans = totalNQueens(1);
        System.out.println(ans);
    }
}





    
