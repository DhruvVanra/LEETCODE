
import java.util.Stack;

class largestRectangleInHistogram84{
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxarea = 0;
        for(int i =0;i<=n;i++){
            int currHight = (i==n) ? 0: heights[i];
            while(!st.isEmpty() && currHight < heights[st.peek()]){
                int top = st.pop();
                int width = st.isEmpty() ? i :i - st.peek() - 1;
                int height = heights[top];
                maxarea = Math.max(maxarea,height*width);
            }
            st.push(i);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}