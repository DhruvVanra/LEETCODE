class mergeAlternately1768{
    public static  String mergeAlternately(String word1, String word2) {
        String result="";
        if(word1.length() == word2.length()){
            for(int i = 0;i<word1.length();i++){
                result += (word1.charAt(i)+""+word2.charAt(i));
            }
        } else if(word1.length()>word2.length()){
            int i = 0;
            for(;i<word2.length();i++){
                result+=(word1.charAt(i)+""+word2.charAt(i));
            }

            for(;i<word1.length();i++){
                result+=word1.charAt(i);
            }
        }else{
            int i = 0;
            for(;i<word1.length();i++){
                result+=(word1.charAt(i)+""+word2.charAt(i));
            }

            for(;i<word2.length();i++){
                result+=word2.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));

    }
}