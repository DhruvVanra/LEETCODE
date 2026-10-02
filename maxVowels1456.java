class maxVowels1456 {

    public static int maxVowels(String s, int k) {
        int left = 0;
        int countVowels = 0;
        int maxVowels = 0;

        for (int right = 0; right < s.length(); right++) {

            if (isVowel(s.charAt(right))) {
                countVowels++;
            }

            // Window size reached k
            if (right - left + 1 == k) {

                maxVowels = Math.max(maxVowels, countVowels);

                if (isVowel(s.charAt(left))) {
                    countVowels--;
                }

                left++;
            }
        }
        return maxVowels;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }
}