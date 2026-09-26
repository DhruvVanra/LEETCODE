class productExceptSelf238{

    public static  int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = prefix;
            prefix = prefix * nums[i];
        }
        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * suffix;
            suffix = suffix * nums[i];
        }

        return arr;
    }

   
    public static void main(String[] args) {
        int nums[] = {-1,1,0,-3,3};
        int arr[] = productExceptSelf(nums);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}