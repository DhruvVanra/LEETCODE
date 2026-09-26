class maxNumofBallon1189{
    public static  int maxNumberOfBalloons(String text) {
        int count[] = new int[26];
        for(int i =0;i<text.length();i++){
            count[text.charAt(i) - 'a']++;
        }        

        boolean temp = true;
        String str = "balloon";
        int c = -1;
        while(temp){
            for(int i=0;i<str.length();i++){
                if(count[str.charAt(i) - 'a'] >= 1){
                    count[str.charAt(i) - 'a']--;
                }else{
                    temp = false;
                    break;
                }
            }
            c++;
        }
     
        return c;
    }
    public static void main(String[] args) {
        String text = "leetcode";
        System.out.println(maxNumberOfBalloons(text));
    }
}