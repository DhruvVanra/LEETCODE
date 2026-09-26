class divide29 {
    public static int divide(int dividend, int divisor) {

        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long count = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= temp + temp) {
                temp += temp;
                multiple += multiple;
            }

            a -= temp;
            count += multiple;
        }

        if (negative) {
            count = -count;
        }

        if (count > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) count;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1073741824;

        System.out.println(divide(dividend, divisor));
    }
}