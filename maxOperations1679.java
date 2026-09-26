
import java.util.*;

class maxOperations1679{
    public static  int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int count = 0;
        while(start < end){
            int sum = nums[start]+nums[end];
            if(sum == k){
                start++;
                end--;
                count++;
            }
            else if(sum > k){
                end--;
            }else{
                start++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
int nums[] = {2, 2, 2, 2, 4, 4, 4, 4, 6, 6, 6};
int k = 8;
// Expected: 4
        System.out.println(maxOperations(nums, k));
    }
}