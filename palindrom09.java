class palindrom09{
    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int num = 0;
        int temp1 = x;
        while(temp1>0){
            int temp = temp1%10;
            num = num*10 + temp;
            temp1 /=10;
        }

        if(num == x){
            return true;
        }else{
            return false;
        }
    }
}
