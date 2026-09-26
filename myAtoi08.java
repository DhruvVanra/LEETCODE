class myAtoi08 {
    public static  int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        boolean isNegative = false;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                isNegative = true;
            }
            i++;
        }

        long num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            // Overflow check
            if (!isNegative && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (isNegative && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        if (isNegative) {
            return (int) -num;
        }

        return (int) num;
    }

    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
}