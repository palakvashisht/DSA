import java.util.HashMap;
import java.util.Map;

public class OptimalFruitBasket {
    public static void main(String[] args) {
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        int l = 0, r = 0, maxVariety = 2, maxLength = 0;
        int length = arr.length;
        Map<Integer, Integer> variety = new HashMap<>();

        while( r < length ) {
            variety.merge(arr[r], 1 , Integer::sum);
            if(variety.size() > maxVariety){
                variety.compute(arr[l], (k , v) -> (v > 1) ? v-1 : null);
                l++;
            }else{
                maxLength = Math.max(maxLength, r - l + 1);
            }
            r++;
        }

        System.out.println("Max length is : "+ maxLength);
    }
}
