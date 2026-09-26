class firstAndLastPosition34{
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = 0;
        int last = nums.length-1;
        int arr[] = new int[2];
        boolean temp = false;
        while(start <= last){
           int mid = start + (last - start) / 2;
            if(nums[mid] == target){
                
                while(mid > 0 && nums[mid] == nums[mid-1]){
                    mid--;
                }
                int sposition = mid;
                while(mid < nums.length-1 && nums[mid] == nums[mid+1]){
                    mid++;
                }
                int lposition = mid;
                arr[0] = sposition;
                arr[1] = lposition;
                temp = true;
                break;
            }
            if(nums[mid] < target){
                start = mid+1;
            }else{
                last = mid-1;
            }
        }
        if(temp){
            return arr;
        }else{
            arr[0] = -1;
            arr[1] = -1;
            return arr;

        }
    }   

    public static void main(String[] args) {
        int nums[] = {};
        int target = 6;
        int arr[] = searchRange(nums, target);
        for(int i : arr){
            System.out.println(i);
        }
    }
    
}