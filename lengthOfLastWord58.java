class lengthOfLastWord55{
    public static  int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int count = 0;
        while(true){
            if(i >= 0 && s.charAt(i) == ' '){
                i--;
            }else{
                break;
            }
        }

        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}