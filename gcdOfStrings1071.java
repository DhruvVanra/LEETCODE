class gcdOfStrings1071{
    public static String gcdOfStrings(String str1, String str2) {
        String result = "";
        if((str1+str2).equals( str2 + str1 )){
            int n1 = str1.length();
            int n2 = str2.length();
            int n ;
            if(n1>n2){
                 n = findgcd(n1, n2);
            }else{
                 n = findgcd(n2, n1);
            }
            for(int i = 0;i<n;i++){
                result+=str1.charAt(i);
            }
            return result;
        }else{
            return result;
        }
    }

    public static int findgcd(int n1,int n2){
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        String str1 = "AAAAAB";
        String str2 = "AAA";
        System.out.println(gcdOfStrings(str1, str2));
    }   
}