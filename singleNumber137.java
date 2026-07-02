import java.util.*;
class singleNumber137{
    public static  int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }else{
                i +=3;
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int nums[] = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }   
}