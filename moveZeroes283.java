class moveZeroes283{
    public static void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                int k = i;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j] != 0){
                        nums[k] = nums[j];
                        nums[j] = 0;
                        k = j;
                    }
                   
                }
            }
        }


        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 0, 2, 0, 3, 0, 0, 4, 5, 0};
       moveZeroes(nums);
    }
}