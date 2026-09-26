class twoSum167{
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int arr[] = new int[2];
        while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }

            if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
       int[] numbers = {-4, -1, 0, 2, 5};
int target = 1;
        int arr[] = twoSum(numbers, target);
        System.out.println(arr[0] + " " + arr[1]);
    }
}