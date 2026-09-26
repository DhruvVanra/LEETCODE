
import java.util.Arrays;

class firstMissingPositive41{
    public static  int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j =1;
        for(int i = 0;i<nums.length;i++){
            if( nums[i] > 0){
                if(nums[i] == j){
                    j++;
                }else if(nums[i] < j){
                    continue;
                }
                else{
                    return j;
                } 
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,2};
        System.out.println(firstMissingPositive(nums));
    }
}