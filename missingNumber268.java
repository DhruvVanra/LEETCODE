import java.util.*;
class missingNumber268{
    public static int missingNumber(int[] nums) {
        if(nums.length ==1){
            if(nums[0] == 0){
                return 1;
            }else{
                return 0;
            }
        }
        Arrays.sort(nums);
        int j =1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == j){
                j++;
            }
            else{
                return j;
            } 
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] ={1,2,0};
        System.out.println(missingNumber(nums));
    }
} 