class missingInteger2996 {
    public static int missingInteger(int[] nums) {

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        while (true) {

            boolean found = false;

            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }

    public static void main(String[] args) {
        int nums[] = {3,4,5,1,12,14,13};
        System.out.println(missingInteger(nums));
    }
}