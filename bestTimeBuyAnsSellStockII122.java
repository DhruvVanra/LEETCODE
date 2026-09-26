class bestTimeBuyAnsSellStockII122{
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int totalprofit = 0;
        for(int i = 1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            int temp = prices[i] - buy;
            if(temp > profit){
                profit = temp;
            }else{
                buy = prices[i];
                totalprofit += profit;
                profit = 0;
            }

        }
        totalprofit += profit;
        return totalprofit;
    
    }


    public static void main(String[] args) {
        int prices[] ={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}