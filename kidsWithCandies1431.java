
import java.util.LinkedList;
import java.util.List;

class kidsWithCandies1431{
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0;i<candies.length;i++){
            if(extraCandies+candies[i] >= max){
                result.addLast(true);
            }else{
                result.addLast(false);
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] candies = {12,1,12};
        int exra = 10;
        System.out.println(kidsWithCandies(candies, exra));

    }
}