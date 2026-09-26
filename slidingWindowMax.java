
import java.util.*;

class slidingWindowMax{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int[] window = new int[nums.length-k+1];
        int n = nums.length;

        int i;

        // Process first window
        for (i = 0; i < k; ++i) {

            while (!Qi.isEmpty() &&
                nums[i] >= nums[Qi.peekLast()])
                Qi.removeLast();

            Qi.addLast(i);
        }
        int j =0;
        // Process remaining elements
        for (; i < n; ++i) {

            window[j] = nums[Qi.peek()];

            // Remove elements out of window
            while ((!Qi.isEmpty()) &&
                Qi.peek() <= i - k){
                    Qi.removeFirst();
            }

            // Remove smaller elements
            while ((!Qi.isEmpty()) && nums[i] >= nums[Qi.peekLast()]){
                Qi.removeLast();
            }

            Qi.addLast(i);
            j++;
        }
        window[j] = nums[Qi.peek()];
        return window;
    }

    public static void main(String[] args) {
       int[] nums = {1,3,3,3,2,5,5,1};
        int k = 3;
        // Expected: {3,3,3,5,5,5}
        int arr[] = maxSlidingWindow(nums, k);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}