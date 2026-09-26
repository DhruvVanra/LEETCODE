
import java.util.*;

class longestConsecutiveSeq128{
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }
        HashSet<Integer> al = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            al.add(nums[i]);
        }
        int length;
        int maxlen = 0;

        for(Integer num : al){
            int num1 = num;
            
            if(!al.contains(num1-1)){
                length=1;
                while(al.contains(num1+1)){
                    length++;
                    num1++;
                }
                maxlen = Math.max(length, maxlen);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}