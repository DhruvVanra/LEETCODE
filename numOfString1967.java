class numOfString1967{
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0;i<patterns.length;i++){
            if(word.indexOf(patterns[i]) != -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String patterms[] ={"a","a","a"};
        System.out.println(numOfStrings(patterms, "ab"));
    }
}