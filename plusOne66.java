class plusOne66{
    public static  int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        int arr[] = plusOne(digits);
        for(int i : arr){
            System.out.println(i);
        }
    }
}