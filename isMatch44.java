class isMatch44{
    public boolean isMatch(String s, String p) {
        int sCount[] = new int[26];
        int qCount = 0;
        int stCount = 0;
        for(int i = 0;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<p.length();i++){
            Character ch = s.charAt(i);
            if(ch == '?'){
                qCount++;
            }else if(ch == '*'){
                return true;
            }
        }

    }
}