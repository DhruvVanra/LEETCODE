
import java.util.*;

class permutationInString567{
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.err.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        // Store frequency
        for(int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if(Arrays.equals(a, b)) {
            return true;
        }

        // Sliding window
        for(int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            b[s2.charAt(i) - 'a']++;

            // Remove old character
            b[s2.charAt(i - s1.length()) - 'a']--;

            // Compare arrays
            if(Arrays.equals(a, b)) {
                return true;
            }
        }

        return false;
    }
}