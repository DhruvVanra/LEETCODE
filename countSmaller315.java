import java.util.*;
class countSmaller315{
    public static  List<Integer> countSmaller(int[] nums) {
        List<Integer> al = new ArrayList<>();
        if(nums.length<2){
            al.add(0);
            return al;
        }
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            int count = 0;
            for(int j = i+1;j<nums.length;j++){
                if(num > nums[j]){
                    count++;
                }
            }
            al.add(count);
        }
        return al;
    }

    public static void main(String[] args) {
        int nums[] ={-1};
        System.out.println(countSmaller(nums));
    }
}