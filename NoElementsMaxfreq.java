import java.util.Arrays;
import java.util.HashMap;

public class NoElementsMaxfreq {


    public int[] twoSum(int[] nums, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = sum - nums[i];
            if (hashMap.containsKey(compliment)) {
                return new int[] {hashMap.get(compliment), i};
            }
            hashMap.put(nums[i], i);

        }
        //return (new int[] {0,0});
        return new int[0];
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 9};
        int[] result = new int[2];
        NoElementsMaxfreq n = new NoElementsMaxfreq();
        result=n.twoSum(nums, 22);
        if (result.length==2) {
            System.out.println("Elements foudn "+ Arrays.toString(result));

        }


    }

}
