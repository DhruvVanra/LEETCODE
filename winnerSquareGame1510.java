class winnerSquareGame1510{
    public static boolean winnerSquareGame(int n) {
        boolean dp[] = new boolean[n+1];

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                int squre = j*j;
                if(squre<=i){
                    if(dp[i-squre] == false){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(winnerSquareGame(n));
    }
}