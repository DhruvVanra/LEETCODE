
import java.util.HashMap;

class nextGraterElementI496{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[nums1.length];
        for(int i =0;i<nums2.length-1;i++){
            int idx = i+1;
            while(idx<nums2.length){
                if(nums2[idx] > nums2[i]){
                    map.put(nums2[i], nums2[idx]);
                    break;
                }else{
                    idx++;
                }
            }
            map.putIfAbsent(nums2[i], -1);
        }
        map.put(nums2[nums2.length-1], -1);

        for(int i =0;i<nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = {1,3,5,2,4};
        int nums2[] ={6,5,4,3,2,1,7};
        int arr[] = nextGreaterElement(nums1, nums2);
        for(int key : arr){
            System.out.print(key + " ");
        }

    }
}