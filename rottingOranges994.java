import java.util.*;

class rottingOranges994{
    public static int orangesRotting(int[][] grid) {
        int minute = 0;
        Queue<int[]> q = new LinkedList<>();
        int freshorang= 0;
        int rottonoranges = 0;
        int empty = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    freshorang++;
                }else if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                    rottonoranges++;
                }else{
                    empty++;
                } 
            }
        }

       
        while(!q.isEmpty() && freshorang > 0){
            int n = q.size();
            minute++;
            for(int i =0;i<n;i++){
                int curr[] = q.poll();
                int row = curr[0];
                int col = curr[1];
                //right
                if(col+1<grid[0].length && grid[row][col+1] == 1){
                        grid[row][col+1] =2;
                        q.add(new int[]{row,col+1});
                        freshorang--;
                }
                //bottom 
                if(row+1<grid.length && grid[row+1][col] == 1){
                        grid[row+1][col] = 2;
                        q.add(new int[]{row+1,col});
                        freshorang--;
                }
                //left
                if(col-1>=0 && grid[row][col-1] == 1){
                        grid[row][col-1] =2;
                        q.add(new int[]{row,col-1});
                        freshorang--;
                }

                //up
                if(row-1>=0 && grid[row-1][col] ==1){
                        grid[row-1][col] = 2;
                        q.add(new int[]{row-1,col});
                        freshorang--;
                }
               
            }
            
        }
            
        if(freshorang>0){
            return -1;
        }else{
            return minute;
        }
    }

    public static void main(String[] args) {
        int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

}