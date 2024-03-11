import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
         //int[] result;
        HashSet<Integer> hs= new HashSet<>();
        for (int num : nums1) {
            System.out.println(Arrays.binarySearch(nums2, num));
            if (Arrays.binarySearch(nums2, num) >= 0) {
                // Found a matching element
                if(!hs.contains(num)) {
                    hs.add(num);
                }


            }
        }

        return hs.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] nums={1,3,4};
        int[] nums1={3,4};
        Intersection I= new Intersection();
        int[] result=I.intersection(nums,nums1);
        System.out.println(Arrays.toString(result));
    }

}
