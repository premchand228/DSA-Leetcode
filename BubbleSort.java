public class BubbleSort
{
    public static void main (String[] args){
        int [] nums={10,20,30,40,50};
        BubbleSort B= new BubbleSort();
        B.sort(nums);

    }

    private void sort(int[] nums) {
        Boolean swapped=false;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>nums[i+1]){
                swapped=true;

                swap(i,i+1,nums);

            }

        }
    }

    private void swap(int i, int j,int[] nums) {
        int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
    }
}
