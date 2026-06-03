

class timeToBuyTIckets2073{
    public static  int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                count+=Math.min(tickets[i], tickets[k]);
            }else{
                count+= Math.min(tickets[i],tickets[k]-1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int tickets[] = {2,3,2};
        System.out.println(timeRequiredToBuy(tickets, 1));
    }
}
