import java.util.*;
class majorityElement229{
    public static  List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/3;
        int tempCount = 1;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                tempCount++;
            } else {
                if (tempCount > n ) {
                    li.add(nums[i]);
                }
                tempCount = 1;
            }
        }

        // Last group check
        if (tempCount > n) {
            li.add(nums[nums.length-1]);
        }

        return li;
    }

    public static void main(String[] args) {
        int nums[] = {1};
        System.out.println(majorityElement(nums));
    }
}