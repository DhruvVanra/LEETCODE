class reverseVowels345{
    public static  String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start<end){
            if(((s.charAt(start)=='a' || s.charAt(start)=='e'|| s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u')|| ( s.charAt(start)=='A' || s.charAt(start)=='E'|| s.charAt(start)=='I'||s.charAt(start)=='O'||s.charAt(start)=='U')) && ((s.charAt(end)=='a' || s.charAt(end)=='e'|| s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')|| ( s.charAt(end)=='A' || s.charAt(end)=='E'|| s.charAt(end)=='I'||s.charAt(end)=='O'||s.charAt(end)=='U'))){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }  else if(((s.charAt(start)=='a' || s.charAt(start)=='e'|| s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u')|| ( s.charAt(start)=='A' || s.charAt(start)=='E'|| s.charAt(start)=='I'||s.charAt(start)=='O'||s.charAt(start)=='U'))){
                end--;
            }else if (((s.charAt(end)=='a' || s.charAt(end)=='e'|| s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')|| ( s.charAt(end)=='A' || s.charAt(end)=='E'|| s.charAt(end)=='I'||s.charAt(end)=='O'||s.charAt(end)=='U'))) {
                start++;
            }else{
                start++;
                end--;
            }
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}