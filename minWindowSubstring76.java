

class minWindowSubstring76{
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        minWindow(s, "ABC");
    }

    public static void minWindow(String s, String t) {
        int[] target = new int[256];


       for (char ch : t.toCharArray()) {
           target[ch]++;
       }

       
    }
}