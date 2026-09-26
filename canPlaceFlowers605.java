class canPlaceFlowers605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 1;
        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                n -= 1;
            }

            return n <= 0;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {


            flowerbed[0] = 1;

            n -= 1;
        }

        while (n > 0 && i < flowerbed.length - 1) {
            if (i - 1 >= 0 &&
                i + 1 < flowerbed.length &&
                flowerbed[i] == 0 &&
                flowerbed[i - 1] == 0 &&
                flowerbed[i + 1] == 0) {

               
                flowerbed[i] = 1;

                n -= 1;
                i += 1;
            }

            i++;
        }

        if (n > 0 &&
            flowerbed[flowerbed.length - 1] == 0 &&
            flowerbed[flowerbed.length - 2] == 0) {

            flowerbed[flowerbed.length - 1] = 1;

            n -= 1;
        }

        return n <= 0;
    }

    public static void main(String[] args) {

        int[] flowerbed = {1, 0, 0, 0, 0, 0, 1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}