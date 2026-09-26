class findMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid[0].length;
        int missing = -1;
        int twice = -1;
        int count [] = new int[len * len];
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                count[grid[i][j]-1]++;
            }
        }

        for(int i = 0;i<count.length;i++){
            if(count[i] == 0){
                missing = i+1;
            }

            if(count[i] == 2){
                twice = i+1;
            }
        }
        int arr[] = {twice,missing};
        return  arr;
    }


}