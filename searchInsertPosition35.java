class searchInsertPosition35{
    public static  int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while(low < high){
            int mid = (high+low)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid;
            }
        }   


       return low;
    }


    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}