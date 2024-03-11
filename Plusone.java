import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plusone {

    public  int[] increase(int[] nums) {

        List<Integer> result =new ArrayList<>();
        int carry=1;
        for(int i=nums.length-1;i>=0;i--){
            int sum=nums[i]+carry;
            result.add(0,sum%10);
            carry=sum/10;

        }
        if(carry!=0){
            result.add(0,carry);
        }
        int[] resArray = new int[result.size()];
        for (int i=0;i<result.size();i++){
            resArray[i]=result.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] nums={9};
        Plusone p= new Plusone();
        int[] nums1=p.increase(nums);
        System.out.println(Arrays.toString(Arrays.stream(nums1).toArray()));

    }
}

