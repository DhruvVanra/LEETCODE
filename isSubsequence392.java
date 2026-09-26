class isSubsequence392{
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i = 0;i < s.length();i++){
            while( j < t.length() && s.charAt(i) != t.charAt(j)  ){
                j++;
            }


            if(j == t.length()){
                return false;
            } 
             
            j++;

        }
       return true;
    }


    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}