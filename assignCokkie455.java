
import java.util.Arrays;
import java.util.Stack;

class assignCokkie455{
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        Stack<Integer> gs = new Stack<>();
        Stack<Integer> ss = new Stack<>();

        for(int i =0;i<g.length;i++){
            gs.push(g[i]);
        }

        for(int i =0;i<s.length;i++){
            ss.push(s[i]);
        }
        int count=0;
        while(!gs.isEmpty() && !ss.isEmpty()){
            if(gs.peek()<= ss.peek()){
                ss.pop();
                count++;
            }
            gs.pop();
        }
        return count;
    }

    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[] = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}