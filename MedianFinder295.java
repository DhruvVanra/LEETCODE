import java.util.*;

class MedianFinder295 {

    private ArrayList<Integer> al;

    public MedianFinder295() {
        al = new ArrayList<>();
    }

    public void addNum(int num) {
        int i = 0;

        // Find the correct position
        while (i < al.size() && al.get(i) < num) {
            i++;
        }

        // Insert at that position
        al.add(i, num);
    }

    public double findMedian() {
        int n = al.size();

        if (n % 2 == 1) {
            return al.get(n / 2);
        } else {
            return (al.get(n / 2 - 1) + al.get(n / 2)) / 2.0;
        }
    }
}