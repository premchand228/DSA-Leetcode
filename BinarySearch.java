import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    // you need a sorted array for binary search

    public static void main(String[] args ){
        ArrayList<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        int target=20;
        int[] nums=l.stream().mapToInt(Integer::intValue).toArray();
        BinarySearch b=new BinarySearch();
        int result=b.search(nums,target);
        System.out.println(result);
        if(result!=-1){
            System.out.println("The target element  is found at index  ".concat(String.valueOf(result)));
        }


    }
    public int search(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]>target){
                r=mid-1;
            }
            else {
                l=mid+1;
            }
            System.out.println(""+l+","+r+","+mid);


        }
        return -1;
    }

}
