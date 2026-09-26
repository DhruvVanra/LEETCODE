import java.util.HashSet;

class longSubstringWithoutrep03 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String sub = "abcddefgh";
        int size = lengthOfLongestSubstring(sub);
        System.out.println(size);
    }
}