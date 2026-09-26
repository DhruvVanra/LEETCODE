import java.util.*;
class subsets90{
    public static  List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    public static void helper(List<List<Integer>> ans,List<Integer> temp,int nums[], int index){

       
        ans.add(new ArrayList<>(temp));


        for(int i = index;i<nums.length;i++){
            
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            helper(ans, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int nums[] ={1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}