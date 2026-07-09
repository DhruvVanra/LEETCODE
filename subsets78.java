import java.util.*;
class subsets78{

    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans, nums, 0, temp);
        return ans;
    }

    public static void helper(List<List<Integer>> ans,int nums[], int index, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i = index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(ans, nums, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        System.out.println(subsets(nums));
    }
}