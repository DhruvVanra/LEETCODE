class minScore2492{
    public static int minScore(int n, int[][] roads) {
        int min = roads[0][2];
        for(int i =1;i<roads.length;i++){
            if(min > roads[i][2]){
                min = roads[i][2];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int roads[][] = {{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        System.out.println(minScore(4, roads));
    }
}