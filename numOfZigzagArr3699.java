import java.util.*;
class numOfZigzagArr3699{
    static List<List<Integer>> li = new ArrayList<>();
    public int zigZagArrays(int n, int l, int r) {
        for(int i =l;i<=r;i++){
            

        }
    }


    public static void helper(int l,int r,int n){
        List<Integer> temp = new ArrayList<>();
        int prev = l;
        for (int i = 0; i <=n; i++) {
            int num = l;

            int[] newarr = new int[n];

            for (int j = 0, k = 0; j <= n; j++) {
                if (j != i) {
                    newarr[k++] = nums[j];
                }
            }

            arrAns[index] = num;
            permutation(newarr, arrAns, index + 1, n);
        }
    }


    
    
}