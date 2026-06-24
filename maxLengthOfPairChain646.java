
import java.util.*;

class maxLengthOfPairChain646{
    public static  int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int count = 1;
        int end = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > end) {
                count++;
                end = pairs[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] pairs = {{1,2},{7,8},{4,5}};
        System.out.println(findLongestChain(pairs));
    }
}