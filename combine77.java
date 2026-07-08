import java.util.*;
class combine77{
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), ans);
        return ans;
    }

    public static void backtrack(int start, int n, int k,List<Integer> temp,List<List<Integer>> ans) {
        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Try every possible number
        for (int i = start; i <= n; i++) {
            temp.add(i);          
            backtrack(i + 1, n, k, temp, ans); 
            temp.remove(temp.size() - 1);
           }   
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}