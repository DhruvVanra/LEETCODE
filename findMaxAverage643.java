class findMaxAverage643{
    public static  double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        
        for(int right = 0;right<nums.length;right++){
            sum+=nums[right];

            if(right-left+1 == k){
                double avg = sum/k;

                maxAvg = Math.max(avg, maxAvg);

                sum-=nums[left];
                left++;
            }

        }   
        return maxAvg;
    }

    public static void main(String[] args) {
        int nums[] = {-1};
        int k =1;
        System.out.println(findMaxAverage(nums, k));
    }
}