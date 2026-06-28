class searchInRotatedSortedArrII81{
    public static boolean search(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;

        while(low <= high){
            int mid = (high+low)/2;

            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] ==nums[high]){
                high--;
                low++;
                continue;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2,2,2};
        int target = 2;
        System.out.println(search(nums, target));
    }
}