
import java.util.*;

class medianOftwoSortedArray04{
    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            al.add(nums1[i]);
        }

        for(int i =0;i<nums2.length;i++){
            al.add(nums2[i]);
        }

        Collections.sort(al);
        int size = al.size();
        if(size%2 == 0){
            int n1 = size/2;
            int n2 = (size/2) - 1 ;
            median = ((double)al.get(n1) + (double)al.get(n2))/2;
        }
        else{
            median = al.get(size/2);
        }
        return median;
    }
}