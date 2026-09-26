class isRectangleOverlap836{
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(((rec1[0] < rec2[2]) && (rec2[0] < rec1[2])) && ((rec1[1] < rec2[3]) && (rec2[1] < rec1[3]))){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int rec1[] = {0,0,1,1};
        int rec2[] = {2,2,3,3};
        System.out.println(isRectangleOverlap(rec1, rec2));
    }
}