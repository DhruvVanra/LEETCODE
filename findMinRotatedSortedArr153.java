class findMinRotatedSortedArr153{
    public static  int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min;
        int minNum = nums[0];
        if(nums[low] < nums[high]){
            return nums[low];
        }
        while(low <= high){
            int mid = (high+low)/2;


            if(nums[low] <= nums[mid]){
                min = nums[low];
                minNum = Math.min(min, minNum);
                low = mid+1;
            }else{
                minNum = Math.min(minNum,nums[mid]);
                high = mid-1;
            }
        }
        return minNum;
    }


    public static void main(String[] args) {
        int nums[] ={11,13,15,17};
        System.out.println(findMin(nums));
    }
}