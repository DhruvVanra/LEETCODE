class maxProduct152{
    public static int maxProduct(int[] nums) {
        int product = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(product < nums[i]) product = nums[i];
            int temp = nums[i];
            for(int j = i+1;j<nums.length;j++){
                temp = temp*nums[j];
                if(product<temp){
                    product = temp;
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int nums[] = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }
}